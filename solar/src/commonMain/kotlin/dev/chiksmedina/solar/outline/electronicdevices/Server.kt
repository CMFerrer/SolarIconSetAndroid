package dev.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.Server: ImageVector
    get() {
        if (_server != null) {
            return _server!!
        }
        _server = Builder(
            name = "Server", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.948f, 1.5f)
                horizontalLineTo(18.052f)
                curveTo(18.9505f, 1.5f, 19.6997f, 1.5f, 20.2945f, 1.5799f)
                curveTo(20.9223f, 1.6643f, 21.4891f, 1.85f, 21.9445f, 2.3055f)
                curveTo(22.4f, 2.7609f, 22.5857f, 3.3277f, 22.6701f, 3.9555f)
                curveTo(22.7501f, 4.5503f, 22.75f, 5.2995f, 22.75f, 6.198f)
                verticalLineTo(6.302f)
                curveTo(22.75f, 7.2005f, 22.7501f, 7.9497f, 22.6701f, 8.5445f)
                curveTo(22.5857f, 9.1723f, 22.4f, 9.7391f, 21.9445f, 10.1945f)
                curveTo(21.4891f, 10.65f, 20.9223f, 10.8357f, 20.2945f, 10.9201f)
                curveTo(19.6997f, 11.0001f, 18.9505f, 11.0f, 18.052f, 11.0f)
                horizontalLineTo(5.948f)
                curveTo(5.0495f, 11.0f, 4.3003f, 11.0001f, 3.7055f, 10.9201f)
                curveTo(3.0777f, 10.8357f, 2.5109f, 10.65f, 2.0555f, 10.1945f)
                curveTo(1.6f, 9.7391f, 1.4143f, 9.1723f, 1.3299f, 8.5445f)
                curveTo(1.25f, 7.9497f, 1.25f, 7.2005f, 1.25f, 6.302f)
                verticalLineTo(6.198f)
                curveTo(1.25f, 5.2995f, 1.25f, 4.5503f, 1.3299f, 3.9555f)
                curveTo(1.4143f, 3.3277f, 1.6f, 2.7609f, 2.0555f, 2.3055f)
                curveTo(2.5109f, 1.85f, 3.0777f, 1.6643f, 3.7055f, 1.5799f)
                curveTo(4.3003f, 1.5f, 5.0495f, 1.5f, 5.948f, 1.5f)
                close()
                moveTo(3.9054f, 3.0665f)
                curveTo(3.4439f, 3.1286f, 3.2464f, 3.2358f, 3.1161f, 3.3661f)
                curveTo(2.9858f, 3.4964f, 2.8786f, 3.6939f, 2.8165f, 4.1554f)
                curveTo(2.7516f, 4.6384f, 2.75f, 5.286f, 2.75f, 6.25f)
                curveTo(2.75f, 7.214f, 2.7516f, 7.8616f, 2.8165f, 8.3446f)
                curveTo(2.8786f, 8.8061f, 2.9858f, 9.0036f, 3.1161f, 9.1339f)
                curveTo(3.2464f, 9.2642f, 3.4439f, 9.3714f, 3.9054f, 9.4335f)
                curveTo(4.3884f, 9.4984f, 5.036f, 9.5f, 6.0f, 9.5f)
                horizontalLineTo(18.0f)
                curveTo(18.964f, 9.5f, 19.6116f, 9.4984f, 20.0946f, 9.4335f)
                curveTo(20.5561f, 9.3714f, 20.7536f, 9.2642f, 20.8839f, 9.1339f)
                curveTo(21.0142f, 9.0036f, 21.1214f, 8.8061f, 21.1835f, 8.3446f)
                curveTo(21.2484f, 7.8616f, 21.25f, 7.214f, 21.25f, 6.25f)
                curveTo(21.25f, 5.286f, 21.2484f, 4.6384f, 21.1835f, 4.1554f)
                curveTo(21.1214f, 3.6939f, 21.0142f, 3.4964f, 20.8839f, 3.3661f)
                curveTo(20.7536f, 3.2358f, 20.5561f, 3.1286f, 20.0946f, 3.0665f)
                curveTo(19.6116f, 3.0016f, 18.964f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.036f, 3.0f, 4.3884f, 3.0016f, 3.9054f, 3.0665f)
                close()
                moveTo(5.25f, 6.25f)
                curveTo(5.25f, 5.8358f, 5.5858f, 5.5f, 6.0f, 5.5f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 5.5f, 8.75f, 5.8358f, 8.75f, 6.25f)
                curveTo(8.75f, 6.6642f, 8.4142f, 7.0f, 8.0f, 7.0f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 7.0f, 5.25f, 6.6642f, 5.25f, 6.25f)
                close()
                moveTo(10.25f, 6.25f)
                curveTo(10.25f, 5.8358f, 10.5858f, 5.5f, 11.0f, 5.5f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 5.5f, 18.75f, 5.8358f, 18.75f, 6.25f)
                curveTo(18.75f, 6.6642f, 18.4142f, 7.0f, 18.0f, 7.0f)
                horizontalLineTo(11.0f)
                curveTo(10.5858f, 7.0f, 10.25f, 6.6642f, 10.25f, 6.25f)
                close()
                moveTo(5.948f, 12.5f)
                horizontalLineTo(18.052f)
                curveTo(18.9505f, 12.5f, 19.6997f, 12.4999f, 20.2945f, 12.5799f)
                curveTo(20.9223f, 12.6643f, 21.4891f, 12.85f, 21.9445f, 13.3055f)
                curveTo(22.4f, 13.7609f, 22.5857f, 14.3277f, 22.6701f, 14.9555f)
                curveTo(22.7501f, 15.5503f, 22.75f, 16.2995f, 22.75f, 17.198f)
                verticalLineTo(17.302f)
                curveTo(22.75f, 18.2005f, 22.7501f, 18.9497f, 22.6701f, 19.5445f)
                curveTo(22.5857f, 20.1723f, 22.4f, 20.7391f, 21.9445f, 21.1945f)
                curveTo(21.4891f, 21.65f, 20.9223f, 21.8357f, 20.2945f, 21.9201f)
                curveTo(19.6997f, 22.0001f, 18.9505f, 22.0f, 18.052f, 22.0f)
                horizontalLineTo(5.948f)
                curveTo(5.0495f, 22.0f, 4.3003f, 22.0001f, 3.7055f, 21.9201f)
                curveTo(3.0777f, 21.8357f, 2.5109f, 21.65f, 2.0555f, 21.1945f)
                curveTo(1.6f, 20.7391f, 1.4143f, 20.1723f, 1.3299f, 19.5445f)
                curveTo(1.25f, 18.9497f, 1.25f, 18.2005f, 1.25f, 17.302f)
                verticalLineTo(17.198f)
                curveTo(1.25f, 16.2995f, 1.25f, 15.5503f, 1.3299f, 14.9555f)
                curveTo(1.4143f, 14.3277f, 1.6f, 13.7609f, 2.0555f, 13.3055f)
                curveTo(2.5109f, 12.85f, 3.0777f, 12.6643f, 3.7055f, 12.5799f)
                curveTo(4.3003f, 12.4999f, 5.0495f, 12.5f, 5.948f, 12.5f)
                close()
                moveTo(3.9054f, 14.0665f)
                curveTo(3.4439f, 14.1286f, 3.2464f, 14.2358f, 3.1161f, 14.3661f)
                curveTo(2.9858f, 14.4964f, 2.8786f, 14.6939f, 2.8165f, 15.1554f)
                curveTo(2.7516f, 15.6384f, 2.75f, 16.286f, 2.75f, 17.25f)
                curveTo(2.75f, 18.214f, 2.7516f, 18.8616f, 2.8165f, 19.3446f)
                curveTo(2.8786f, 19.8061f, 2.9858f, 20.0036f, 3.1161f, 20.1339f)
                curveTo(3.2464f, 20.2642f, 3.4439f, 20.3714f, 3.9054f, 20.4335f)
                curveTo(4.3884f, 20.4984f, 5.036f, 20.5f, 6.0f, 20.5f)
                horizontalLineTo(18.0f)
                curveTo(18.964f, 20.5f, 19.6116f, 20.4984f, 20.0946f, 20.4335f)
                curveTo(20.5561f, 20.3714f, 20.7536f, 20.2642f, 20.8839f, 20.1339f)
                curveTo(21.0142f, 20.0036f, 21.1214f, 19.8061f, 21.1835f, 19.3446f)
                curveTo(21.2484f, 18.8616f, 21.25f, 18.214f, 21.25f, 17.25f)
                curveTo(21.25f, 16.286f, 21.2484f, 15.6384f, 21.1835f, 15.1554f)
                curveTo(21.1214f, 14.6939f, 21.0142f, 14.4964f, 20.8839f, 14.3661f)
                curveTo(20.7536f, 14.2358f, 20.5561f, 14.1286f, 20.0946f, 14.0665f)
                curveTo(19.6116f, 14.0016f, 18.964f, 14.0f, 18.0f, 14.0f)
                horizontalLineTo(6.0f)
                curveTo(5.036f, 14.0f, 4.3884f, 14.0016f, 3.9054f, 14.0665f)
                close()
                moveTo(5.25f, 17.25f)
                curveTo(5.25f, 16.8358f, 5.5858f, 16.5f, 6.0f, 16.5f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 16.5f, 8.75f, 16.8358f, 8.75f, 17.25f)
                curveTo(8.75f, 17.6642f, 8.4142f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 18.0f, 5.25f, 17.6642f, 5.25f, 17.25f)
                close()
                moveTo(10.25f, 17.25f)
                curveTo(10.25f, 16.8358f, 10.5858f, 16.5f, 11.0f, 16.5f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 16.5f, 18.75f, 16.8358f, 18.75f, 17.25f)
                curveTo(18.75f, 17.6642f, 18.4142f, 18.0f, 18.0f, 18.0f)
                horizontalLineTo(11.0f)
                curveTo(10.5858f, 18.0f, 10.25f, 17.6642f, 10.25f, 17.25f)
                close()
            }
        }
            .build()
        return _server!!
    }

private var _server: ImageVector? = null
