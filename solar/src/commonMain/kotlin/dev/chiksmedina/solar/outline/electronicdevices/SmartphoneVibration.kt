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

val ElectronicDevicesGroup.SmartphoneVibration: ImageVector
    get() {
        if (_smartphoneVibration != null) {
            return _smartphoneVibration!!
        }
        _smartphoneVibration = Builder(
            name = "SmartphoneVibration", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.9451f, 1.25f)
                horizontalLineTo(13.0549f)
                curveTo(14.4224f, 1.25f, 15.5248f, 1.25f, 16.3917f, 1.3665f)
                curveTo(17.2918f, 1.4875f, 18.0497f, 1.7464f, 18.6516f, 2.3484f)
                curveTo(19.2535f, 2.9503f, 19.5124f, 3.7081f, 19.6335f, 4.6083f)
                curveTo(19.75f, 5.4752f, 19.75f, 6.5775f, 19.75f, 7.9451f)
                verticalLineTo(16.0549f)
                curveTo(19.75f, 17.4225f, 19.75f, 18.5248f, 19.6335f, 19.3918f)
                curveTo(19.5124f, 20.2919f, 19.2535f, 21.0497f, 18.6516f, 21.6517f)
                curveTo(18.0497f, 22.2536f, 17.2918f, 22.5125f, 16.3917f, 22.6335f)
                curveTo(15.5248f, 22.75f, 14.4224f, 22.75f, 13.0549f, 22.75f)
                horizontalLineTo(10.9451f)
                curveTo(9.5775f, 22.75f, 8.4752f, 22.75f, 7.6082f, 22.6335f)
                curveTo(6.7081f, 22.5125f, 5.9503f, 22.2536f, 5.3483f, 21.6517f)
                curveTo(4.7464f, 21.0497f, 4.4875f, 20.2919f, 4.3665f, 19.3918f)
                curveTo(4.2499f, 18.5248f, 4.25f, 17.4225f, 4.25f, 16.0549f)
                verticalLineTo(7.9451f)
                curveTo(4.25f, 6.5775f, 4.2499f, 5.4752f, 4.3665f, 4.6083f)
                curveTo(4.4875f, 3.7081f, 4.7464f, 2.9503f, 5.3483f, 2.3484f)
                curveTo(5.9503f, 1.7464f, 6.7081f, 1.4875f, 7.6082f, 1.3665f)
                curveTo(8.4752f, 1.25f, 9.5775f, 1.25f, 10.9451f, 1.25f)
                close()
                moveTo(7.8081f, 2.8531f)
                curveTo(7.0743f, 2.9518f, 6.6858f, 3.1323f, 6.409f, 3.409f)
                curveTo(6.1322f, 3.6858f, 5.9518f, 4.0743f, 5.8531f, 4.8081f)
                curveTo(5.7516f, 5.5635f, 5.75f, 6.5646f, 5.75f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(5.75f, 17.4354f, 5.7516f, 18.4365f, 5.8531f, 19.1919f)
                curveTo(5.9518f, 19.9257f, 6.1322f, 20.3142f, 6.409f, 20.591f)
                curveTo(6.6858f, 20.8678f, 7.0743f, 21.0482f, 7.8081f, 21.1469f)
                curveTo(8.5634f, 21.2484f, 9.5646f, 21.25f, 11.0f, 21.25f)
                horizontalLineTo(13.0f)
                curveTo(14.4354f, 21.25f, 15.4365f, 21.2484f, 16.1919f, 21.1469f)
                curveTo(16.9256f, 21.0482f, 17.3142f, 20.8678f, 17.591f, 20.591f)
                curveTo(17.8677f, 20.3142f, 18.0482f, 19.9257f, 18.1468f, 19.1919f)
                curveTo(18.2484f, 18.4365f, 18.25f, 17.4354f, 18.25f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(18.25f, 6.5646f, 18.2484f, 5.5635f, 18.1468f, 4.8081f)
                curveTo(18.0482f, 4.0743f, 17.8677f, 3.6858f, 17.591f, 3.409f)
                curveTo(17.3142f, 3.1323f, 16.9256f, 2.9518f, 16.1919f, 2.8531f)
                curveTo(15.4365f, 2.7516f, 14.4354f, 2.75f, 13.0f, 2.75f)
                horizontalLineTo(11.0f)
                curveTo(9.5646f, 2.75f, 8.5634f, 2.7516f, 7.8081f, 2.8531f)
                close()
                moveTo(1.6646f, 5.3292f)
                curveTo(2.035f, 5.1439f, 2.4856f, 5.2941f, 2.6708f, 5.6646f)
                lineTo(3.4472f, 7.2174f)
                curveTo(3.6935f, 7.7101f, 3.6935f, 8.29f, 3.4472f, 8.7826f)
                lineTo(2.8944f, 9.8882f)
                curveTo(2.8592f, 9.9586f, 2.8592f, 10.0414f, 2.8944f, 10.1118f)
                lineTo(3.4472f, 11.2174f)
                curveTo(3.6935f, 11.71f, 3.6935f, 12.29f, 3.4472f, 12.7826f)
                lineTo(2.8944f, 13.8882f)
                curveTo(2.8592f, 13.9586f, 2.8592f, 14.0414f, 2.8944f, 14.1118f)
                lineTo(3.4472f, 15.2174f)
                curveTo(3.6935f, 15.7101f, 3.6935f, 16.29f, 3.4472f, 16.7826f)
                lineTo(2.6708f, 18.3354f)
                curveTo(2.4856f, 18.7059f, 2.035f, 18.8561f, 1.6646f, 18.6708f)
                curveTo(1.2941f, 18.4856f, 1.1439f, 18.0351f, 1.3292f, 17.6646f)
                lineTo(2.1056f, 16.1118f)
                curveTo(2.1407f, 16.0414f, 2.1407f, 15.9586f, 2.1056f, 15.8882f)
                lineTo(1.5528f, 14.7826f)
                curveTo(1.3064f, 14.29f, 1.3064f, 13.71f, 1.5528f, 13.2174f)
                lineTo(2.1056f, 12.1118f)
                curveTo(2.1407f, 12.0414f, 2.1407f, 11.9586f, 2.1056f, 11.8882f)
                lineTo(1.5528f, 10.7826f)
                curveTo(1.3064f, 10.29f, 1.3064f, 9.71f, 1.5528f, 9.2174f)
                lineTo(2.1056f, 8.1118f)
                curveTo(2.1407f, 8.0414f, 2.1407f, 7.9586f, 2.1056f, 7.8882f)
                lineTo(1.3292f, 6.3354f)
                curveTo(1.1439f, 5.9649f, 1.2941f, 5.5144f, 1.6646f, 5.3292f)
                close()
                moveTo(22.3354f, 5.3292f)
                curveTo(22.7059f, 5.5144f, 22.856f, 5.9649f, 22.6708f, 6.3354f)
                lineTo(21.8944f, 7.8882f)
                curveTo(21.8592f, 7.9586f, 21.8592f, 8.0414f, 21.8944f, 8.1118f)
                lineTo(22.4472f, 9.2174f)
                curveTo(22.6935f, 9.71f, 22.6935f, 10.29f, 22.4472f, 10.7826f)
                lineTo(21.8944f, 11.8882f)
                curveTo(21.8592f, 11.9586f, 21.8592f, 12.0414f, 21.8944f, 12.1118f)
                lineTo(22.4472f, 13.2174f)
                curveTo(22.6935f, 13.71f, 22.6935f, 14.29f, 22.4472f, 14.7826f)
                lineTo(21.8944f, 15.8882f)
                curveTo(21.8592f, 15.9586f, 21.8592f, 16.0414f, 21.8944f, 16.1118f)
                lineTo(22.6708f, 17.6646f)
                curveTo(22.856f, 18.0351f, 22.7059f, 18.4856f, 22.3354f, 18.6708f)
                curveTo(21.9649f, 18.8561f, 21.5144f, 18.7059f, 21.3292f, 18.3354f)
                lineTo(20.5528f, 16.7826f)
                curveTo(20.3064f, 16.29f, 20.3064f, 15.7101f, 20.5528f, 15.2174f)
                lineTo(21.1056f, 14.1118f)
                curveTo(21.1407f, 14.0414f, 21.1407f, 13.9586f, 21.1056f, 13.8882f)
                lineTo(20.5528f, 12.7826f)
                curveTo(20.3064f, 12.29f, 20.3064f, 11.71f, 20.5528f, 11.2174f)
                lineTo(21.1056f, 10.1118f)
                curveTo(21.1407f, 10.0414f, 21.1407f, 9.9586f, 21.1056f, 9.8882f)
                lineTo(20.5528f, 8.7826f)
                curveTo(20.3064f, 8.29f, 20.3064f, 7.7101f, 20.5528f, 7.2174f)
                lineTo(21.3292f, 5.6646f)
                curveTo(21.5144f, 5.2941f, 21.9649f, 5.1439f, 22.3354f, 5.3292f)
                close()
                moveTo(8.75f, 19.0f)
                curveTo(8.75f, 18.5858f, 9.0858f, 18.25f, 9.5f, 18.25f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 18.25f, 15.25f, 18.5858f, 15.25f, 19.0f)
                curveTo(15.25f, 19.4142f, 14.9142f, 19.75f, 14.5f, 19.75f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 19.75f, 8.75f, 19.4142f, 8.75f, 19.0f)
                close()
            }
        }
            .build()
        return _smartphoneVibration!!
    }

private var _smartphoneVibration: ImageVector? = null
