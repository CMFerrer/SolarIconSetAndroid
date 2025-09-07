package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.MonitorCamera: ImageVector
    get() {
        if (_monitorCamera != null) {
            return _monitorCamera!!
        }
        _monitorCamera = Builder(
            name = "MonitorCamera", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(13.5858f, 2.0f, 12.8787f, 2.0f, 12.4393f, 2.4393f)
                curveTo(12.0f, 2.8787f, 12.0f, 3.5858f, 12.0f, 5.0f)
                curveTo(12.0f, 6.4142f, 12.0f, 7.1213f, 12.4393f, 7.5607f)
                curveTo(12.8787f, 8.0f, 13.5858f, 8.0f, 15.0f, 8.0f)
                horizontalLineTo(16.0f)
                curveTo(17.4142f, 8.0f, 18.1213f, 8.0f, 18.5607f, 7.5607f)
                curveTo(18.8453f, 7.276f, 18.9455f, 6.879f, 18.9808f, 6.25f)
                horizontalLineTo(19.0f)
                lineTo(20.6154f, 6.9231f)
                curveTo(21.2416f, 7.184f, 21.5547f, 7.3145f, 21.7774f, 7.166f)
                curveTo(22.0f, 7.0176f, 22.0f, 6.6784f, 22.0f, 6.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.3216f, 22.0f, 2.9824f, 21.7774f, 2.834f)
                curveTo(21.5547f, 2.6855f, 21.2416f, 2.816f, 20.6154f, 3.0769f)
                lineTo(19.0f, 3.75f)
                horizontalLineTo(18.9808f)
                curveTo(18.9455f, 3.121f, 18.8453f, 2.724f, 18.5607f, 2.4393f)
                curveTo(18.1213f, 2.0f, 17.4142f, 2.0f, 16.0f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.9846f, 17.5f)
                curveTo(5.1453f, 17.5f, 3.7256f, 17.5f, 2.8436f, 16.6213f)
                curveTo(2.2721f, 16.052f, 2.0708f, 15.2579f, 2.0f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                curveTo(21.9292f, 15.2579f, 21.7279f, 16.052f, 21.1564f, 16.6213f)
                curveTo(20.2744f, 17.5f, 18.8547f, 17.5f, 16.0154f, 17.5f)
                horizontalLineTo(12.7529f)
                verticalLineTo(21.5f)
                horizontalLineTo(16.0154f)
                curveTo(16.4312f, 21.5f, 16.7683f, 21.8358f, 16.7683f, 22.25f)
                curveTo(16.7683f, 22.6642f, 16.4312f, 23.0f, 16.0154f, 23.0f)
                horizontalLineTo(7.9846f)
                curveTo(7.5688f, 23.0f, 7.2317f, 22.6642f, 7.2317f, 22.25f)
                curveTo(7.2317f, 21.8358f, 7.5688f, 21.5f, 7.9846f, 21.5f)
                horizontalLineTo(11.2471f)
                verticalLineTo(17.5f)
                horizontalLineTo(7.9846f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.9999f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(21.9999f, 11.5516f, 21.9935f, 12.5494f, 21.987f, 13.0f)
                horizontalLineTo(2.0f)
                curveTo(1.9935f, 12.5494f, 1.9999f, 11.5516f, 1.9999f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(1.9999f, 6.2288f, 1.9999f, 4.3432f, 3.1715f, 3.1716f)
                curveTo(4.3431f, 2.0f, 6.2287f, 2.0f, 9.9999f, 2.0f)
                horizontalLineTo(10.9181f)
                curveTo(10.7128f, 2.3843f, 10.6178f, 2.7859f, 10.5682f, 3.1542f)
                curveTo(10.4997f, 3.6641f, 10.4998f, 4.2823f, 10.4999f, 4.9184f)
                lineTo(10.4999f, 5.0f)
                lineTo(10.4999f, 5.0816f)
                curveTo(10.4998f, 5.7177f, 10.4997f, 6.3359f, 10.5682f, 6.8458f)
                curveTo(10.6455f, 7.4206f, 10.8338f, 8.0765f, 11.3786f, 8.6213f)
                curveTo(11.9234f, 9.1661f, 12.5794f, 9.3544f, 13.1542f, 9.4317f)
                curveTo(13.664f, 9.5003f, 14.2822f, 9.5001f, 14.9183f, 9.5f)
                lineTo(14.9999f, 9.5f)
                horizontalLineTo(15.9999f)
                lineTo(16.0816f, 9.5f)
                curveTo(16.7177f, 9.5001f, 17.3359f, 9.5003f, 17.8457f, 9.4317f)
                curveTo(18.4205f, 9.3544f, 19.0764f, 9.1661f, 19.6213f, 8.6213f)
                curveTo(19.7371f, 8.5055f, 19.837f, 8.3843f, 19.9233f, 8.2597f)
                lineTo(20.0384f, 8.3077f)
                lineTo(20.0951f, 8.3314f)
                curveTo(20.355f, 8.4399f, 20.6841f, 8.5774f, 20.9795f, 8.6522f)
                curveTo(21.2132f, 8.7113f, 21.5856f, 8.7744f, 21.9977f, 8.6794f)
                curveTo(21.9999f, 9.092f, 21.9999f, 9.5314f, 21.9999f, 10.0f)
                close()
            }
        }
            .build()
        return _monitorCamera!!
    }

private var _monitorCamera: ImageVector? = null
