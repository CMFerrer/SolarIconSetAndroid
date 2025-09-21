package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

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
                moveTo(8.0f, 17.0f)
                curveTo(5.1716f, 17.0f, 3.7574f, 17.0f, 2.8787f, 16.1213f)
                curveTo(2.3094f, 15.552f, 2.1089f, 14.7579f, 2.0384f, 13.5f)
                horizontalLineTo(21.9616f)
                curveTo(21.8911f, 14.7579f, 21.6906f, 15.552f, 21.1213f, 16.1213f)
                curveTo(20.2426f, 17.0f, 18.8284f, 17.0f, 16.0f, 17.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 21.0f, 16.75f, 21.3358f, 16.75f, 21.75f)
                curveTo(16.75f, 22.1642f, 16.4142f, 22.5f, 16.0f, 22.5f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 22.5f, 7.25f, 22.1642f, 7.25f, 21.75f)
                curveTo(7.25f, 21.3358f, 7.5858f, 21.0f, 8.0f, 21.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 11.5516f, 22.0f, 12.0494f, 21.9935f, 12.5f)
                horizontalLineTo(2.0065f)
                curveTo(2.0f, 12.0494f, 2.0f, 11.5516f, 2.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 6.2288f, 2.0f, 4.3432f, 3.1716f, 3.1716f)
                curveTo(4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(10.9181f)
                curveTo(10.7129f, 2.3843f, 10.6178f, 2.7859f, 10.5683f, 3.1542f)
                curveTo(10.4997f, 3.6641f, 10.4999f, 4.2823f, 10.5f, 4.9184f)
                lineTo(10.5f, 5.0f)
                lineTo(10.5f, 5.0816f)
                curveTo(10.4999f, 5.7177f, 10.4997f, 6.3359f, 10.5683f, 6.8458f)
                curveTo(10.6456f, 7.4206f, 10.8339f, 8.0765f, 11.3787f, 8.6213f)
                curveTo(11.9235f, 9.1661f, 12.5794f, 9.3544f, 13.1542f, 9.4317f)
                curveTo(13.6641f, 9.5003f, 14.2823f, 9.5001f, 14.9184f, 9.5f)
                lineTo(15.0f, 9.5f)
                horizontalLineTo(16.0f)
                lineTo(16.0816f, 9.5f)
                curveTo(16.7177f, 9.5001f, 17.3359f, 9.5003f, 17.8458f, 9.4317f)
                curveTo(18.4206f, 9.3544f, 19.0765f, 9.1661f, 19.6213f, 8.6213f)
                curveTo(19.7372f, 8.5055f, 19.8371f, 8.3843f, 19.9233f, 8.2597f)
                lineTo(20.0385f, 8.3077f)
                lineTo(20.0952f, 8.3314f)
                curveTo(20.355f, 8.4399f, 20.6841f, 8.5774f, 20.9796f, 8.6522f)
                curveTo(21.2132f, 8.7113f, 21.5857f, 8.7744f, 21.9978f, 8.6794f)
                curveTo(22.0f, 9.092f, 22.0f, 9.5314f, 22.0f, 10.0f)
                close()
            }
        }
            .build()
        return _monitorCamera!!
    }

private var _monitorCamera: ImageVector? = null
