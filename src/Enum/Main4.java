package Enum;

import java.util.Arrays;

class Main4 {
    public static void main(String[] args) {
        NotificationOptions notificationOptions = new NotificationOptions();

        Channels.EMAIL.setChannelEnabled(notificationOptions, true);
        Channels.PUSH.setChannelEnabled(notificationOptions,false);
        System.out.println(Channels.PUSH.isChannelEnabled(notificationOptions));
        System.out.println(Arrays.toString(Channels.values()));

    }


    static class NotificationOptions {
        boolean isPushEnabled;
        boolean isEmailEnabled;
        boolean isSmsEnabled;
    }

    enum Channels {
        PUSH() {
            @Override
            boolean isChannelEnabled(NotificationOptions options) {
                return options.isPushEnabled;
            }

            @Override
            void setChannelEnabled(NotificationOptions options, boolean isEnabled) {
                options.isPushEnabled = isEnabled;
            }
        },
        EMAIL {
            @Override
            boolean isChannelEnabled(NotificationOptions options){return options.isEmailEnabled;}
            @Override
            void setChannelEnabled(NotificationOptions options, boolean isEnabled){
                options.isEmailEnabled = isEnabled;
            }
        },
        SMS {
            @Override
            boolean isChannelEnabled(NotificationOptions options) {
                return options.isSmsEnabled;
            }

            @Override
            void setChannelEnabled(NotificationOptions options, boolean isEnabled) {
                options.isSmsEnabled = isEnabled;}
            };



            abstract boolean isChannelEnabled(NotificationOptions options);

            abstract void setChannelEnabled(NotificationOptions options, boolean isEnabled);
        }


    }