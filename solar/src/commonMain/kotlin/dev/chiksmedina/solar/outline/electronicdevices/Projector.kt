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

val ElectronicDevicesGroup.Projector: ImageVector
    get() {
        if (_projector != null) {
            return _projector!!
        }
        _projector = Builder(
            name = "Projector", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.5882f, 6.4654f)
                curveTo(10.0616f, 7.173f, 9.75f, 8.0501f, 9.75f, 9.0f)
                curveTo(9.75f, 11.3472f, 11.6528f, 13.25f, 14.0f, 13.25f)
                curveTo(16.3472f, 13.25f, 18.25f, 11.3472f, 18.25f, 9.0f)
                curveTo(18.25f, 8.0893f, 17.9635f, 7.2455f, 17.4758f, 6.5537f)
                curveTo(17.4201f, 6.4993f, 17.373f, 6.4363f, 17.3364f, 6.367f)
                curveTo(16.558f, 5.3821f, 15.3528f, 4.75f, 14.0f, 4.75f)
                curveTo(12.6166f, 4.75f, 11.3875f, 5.411f, 10.6115f, 6.4344f)
                curveTo(10.604f, 6.4449f, 10.5962f, 6.4552f, 10.5882f, 6.4654f)
                close()
                moveTo(8.7069f, 6.75f)
                curveTo(8.4128f, 7.4411f, 8.25f, 8.2015f, 8.25f, 9.0f)
                curveTo(8.25f, 12.1756f, 10.8244f, 14.75f, 14.0f, 14.75f)
                curveTo(17.1756f, 14.75f, 19.75f, 12.1756f, 19.75f, 9.0f)
                curveTo(19.75f, 8.2499f, 19.6064f, 7.5333f, 19.3451f, 6.8762f)
                curveTo(19.9742f, 6.9771f, 20.329f, 7.147f, 20.591f, 7.409f)
                curveTo(20.8678f, 7.6858f, 21.0482f, 8.0743f, 21.1469f, 8.8081f)
                curveTo(21.2484f, 9.5635f, 21.25f, 10.5646f, 21.25f, 12.0f)
                curveTo(21.25f, 13.4354f, 21.2484f, 14.4365f, 21.1469f, 15.1919f)
                curveTo(21.0482f, 15.9257f, 20.8678f, 16.3142f, 20.591f, 16.591f)
                curveTo(20.3142f, 16.8678f, 19.9257f, 17.0482f, 19.1919f, 17.1469f)
                curveTo(18.4365f, 17.2484f, 17.4354f, 17.25f, 16.0f, 17.25f)
                horizontalLineTo(8.0f)
                curveTo(6.5646f, 17.25f, 5.5635f, 17.2484f, 4.8081f, 17.1469f)
                curveTo(4.0743f, 17.0482f, 3.6858f, 16.8678f, 3.409f, 16.591f)
                curveTo(3.1323f, 16.3142f, 2.9518f, 15.9257f, 2.8531f, 15.1919f)
                curveTo(2.7516f, 14.4365f, 2.75f, 13.4354f, 2.75f, 12.0f)
                curveTo(2.75f, 10.5646f, 2.7516f, 9.5635f, 2.8531f, 8.8081f)
                curveTo(2.9518f, 8.0744f, 3.1323f, 7.6858f, 3.409f, 7.409f)
                curveTo(3.6858f, 7.1322f, 4.0743f, 6.9518f, 4.8081f, 6.8531f)
                curveTo(5.5635f, 6.7516f, 6.5646f, 6.75f, 8.0f, 6.75f)
                horizontalLineTo(8.7069f)
                close()
                moveTo(9.641f, 5.25f)
                lineTo(7.9451f, 5.25f)
                curveTo(6.5775f, 5.25f, 5.4752f, 5.25f, 4.6083f, 5.3665f)
                curveTo(3.7081f, 5.4875f, 2.9503f, 5.7464f, 2.3484f, 6.3484f)
                curveTo(1.7464f, 6.9503f, 1.4875f, 7.7081f, 1.3665f, 8.6082f)
                curveTo(1.25f, 9.4752f, 1.25f, 10.5775f, 1.25f, 11.9451f)
                verticalLineTo(12.0549f)
                curveTo(1.25f, 13.4225f, 1.25f, 14.5248f, 1.3665f, 15.3918f)
                curveTo(1.4875f, 16.2919f, 1.7464f, 17.0497f, 2.3484f, 17.6517f)
                curveTo(2.9503f, 18.2536f, 3.7081f, 18.5125f, 4.6083f, 18.6335f)
                curveTo(4.6809f, 18.6432f, 4.7553f, 18.6522f, 4.8313f, 18.6604f)
                lineTo(4.3292f, 19.6646f)
                curveTo(4.1439f, 20.0351f, 4.2941f, 20.4856f, 4.6646f, 20.6708f)
                curveTo(5.0351f, 20.8561f, 5.4856f, 20.7059f, 5.6708f, 20.3354f)
                lineTo(6.4669f, 18.7431f)
                curveTo(6.9207f, 18.75f, 7.4128f, 18.75f, 7.9451f, 18.75f)
                horizontalLineTo(16.0549f)
                curveTo(16.5872f, 18.75f, 17.0793f, 18.75f, 17.5331f, 18.7431f)
                lineTo(18.3292f, 20.3354f)
                curveTo(18.5144f, 20.7059f, 18.9649f, 20.8561f, 19.3354f, 20.6708f)
                curveTo(19.7059f, 20.4856f, 19.8561f, 20.0351f, 19.6708f, 19.6646f)
                lineTo(19.1687f, 18.6604f)
                curveTo(19.2447f, 18.6522f, 19.3191f, 18.6432f, 19.3918f, 18.6335f)
                curveTo(20.2919f, 18.5125f, 21.0497f, 18.2536f, 21.6517f, 17.6517f)
                curveTo(22.2536f, 17.0497f, 22.5125f, 16.2919f, 22.6335f, 15.3918f)
                curveTo(22.75f, 14.5248f, 22.75f, 13.4225f, 22.75f, 12.0549f)
                verticalLineTo(11.9451f)
                curveTo(22.75f, 10.5775f, 22.75f, 9.4752f, 22.6335f, 8.6082f)
                curveTo(22.5125f, 7.7081f, 22.2536f, 6.9503f, 21.6517f, 6.3484f)
                curveTo(20.8493f, 5.546f, 19.7566f, 5.3446f, 18.3858f, 5.2813f)
                curveTo(17.3311f, 4.0386f, 15.7576f, 3.25f, 14.0f, 3.25f)
                curveTo(12.2572f, 3.25f, 10.6954f, 4.0254f, 9.641f, 5.25f)
                close()
                moveTo(13.25f, 7.0f)
                curveTo(13.25f, 6.5858f, 13.5858f, 6.25f, 14.0f, 6.25f)
                curveTo(15.5188f, 6.25f, 16.75f, 7.4812f, 16.75f, 9.0f)
                curveTo(16.75f, 10.5188f, 15.5188f, 11.75f, 14.0f, 11.75f)
                curveTo(12.4812f, 11.75f, 11.25f, 10.5188f, 11.25f, 9.0f)
                curveTo(11.25f, 8.5858f, 11.5858f, 8.25f, 12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 8.5858f, 12.75f, 9.0f)
                curveTo(12.75f, 9.6904f, 13.3096f, 10.25f, 14.0f, 10.25f)
                curveTo(14.6904f, 10.25f, 15.25f, 9.6904f, 15.25f, 9.0f)
                curveTo(15.25f, 8.3096f, 14.6904f, 7.75f, 14.0f, 7.75f)
                curveTo(13.5858f, 7.75f, 13.25f, 7.4142f, 13.25f, 7.0f)
                close()
                moveTo(5.4999f, 8.75f)
                curveTo(5.9141f, 8.75f, 6.2499f, 9.0857f, 6.25f, 9.4999f)
                lineTo(6.2502f, 11.0f)
                curveTo(6.2502f, 11.4142f, 5.9145f, 11.75f, 5.5003f, 11.7501f)
                curveTo(5.0861f, 11.7502f, 4.7502f, 11.4144f, 4.7502f, 11.0002f)
                lineTo(4.75f, 9.5001f)
                curveTo(4.7499f, 9.0859f, 5.0857f, 8.75f, 5.4999f, 8.75f)
                close()
            }
        }
            .build()
        return _projector!!
    }

private var _projector: ImageVector? = null
