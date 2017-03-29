#! /bin/sh
### BEGIN INIT INFO
# Provides: dvfs rules
# Description: rules to deal with dvfs
### END INIT INFO

case $1 in
	start)
		echo ondemand > /sys/devices/system/cpu/cpufreq/policy0/scaling_governor
	;;
esac

exit 0