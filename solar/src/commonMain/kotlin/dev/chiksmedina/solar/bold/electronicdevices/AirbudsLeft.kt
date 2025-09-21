package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.AirbudsLeft: ImageVector
    get() {
        if (_airbudsLeft != null) {
            return _airbudsLeft!!
        }
        _airbudsLeft = Builder(
            name = "AirbudsLeft", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.265f, 4.9508f)
                curveTo(13.1826f, 5.3568f, 13.4449f, 5.7526f, 13.8508f, 5.835f)
                curveTo(15.5147f, 6.1728f, 16.8272f, 7.4853f, 17.165f, 9.1492f)
                curveTo(17.2474f, 9.5551f, 17.6432f, 9.8174f, 18.0492f, 9.735f)
                curveTo(18.4551f, 9.6526f, 18.7174f, 9.2567f, 18.635f, 8.8508f)
                curveTo(18.1774f, 6.5965f, 16.4035f, 4.8226f, 14.1492f, 4.365f)
                curveTo(13.7433f, 4.2826f, 13.3474f, 4.5449f, 13.265f, 4.9508f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.3823f, 22.0f)
                curveTo(3.0666f, 22.0f, 2.0f, 20.8807f, 2.0f, 19.5f)
                horizontalLineTo(6.7647f)
                curveTo(6.7647f, 20.8807f, 5.6981f, 22.0f, 4.3823f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.0f, 7.8889f)
                verticalLineTo(5.5417f)
                curveTo(11.0f, 5.3483f, 11.0f, 5.2515f, 10.9962f, 5.1698f)
                curveTo(10.916f, 3.4574f, 9.6112f, 2.0881f, 7.9794f, 2.004f)
                curveTo(7.9015f, 2.0f, 7.8093f, 2.0f, 7.625f, 2.0f)
                curveTo(7.3178f, 2.0f, 7.1642f, 2.0f, 7.0343f, 2.0067f)
                curveTo(4.3147f, 2.1469f, 2.14f, 4.429f, 2.0064f, 7.283f)
                curveTo(2.0f, 7.4192f, 2.0f, 7.5804f, 2.0f, 7.9028f)
                verticalLineTo(17.8333f)
                horizontalLineTo(6.7647f)
                verticalLineTo(12.3333f)
                curveTo(6.7647f, 11.7197f, 7.2388f, 11.2222f, 7.8235f, 11.2222f)
                curveTo(9.5779f, 11.2222f, 11.0f, 9.7298f, 11.0f, 7.8889f)
                close()
                moveTo(9.3235f, 5.125f)
                curveTo(9.3235f, 4.6648f, 8.9877f, 4.2917f, 8.5735f, 4.2917f)
                curveTo(8.1593f, 4.2917f, 7.8235f, 4.6648f, 7.8235f, 5.125f)
                verticalLineTo(7.9028f)
                curveTo(7.8235f, 8.363f, 8.1593f, 8.7361f, 8.5735f, 8.7361f)
                curveTo(8.9877f, 8.7361f, 9.3235f, 8.363f, 9.3235f, 7.9028f)
                verticalLineTo(5.125f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.5f, 22.0f)
                curveTo(13.4624f, 22.0f, 11.0f, 19.5376f, 11.0f, 16.5f)
                curveTo(11.0f, 13.4624f, 13.4624f, 11.0f, 16.5f, 11.0f)
                curveTo(19.5376f, 11.0f, 22.0f, 13.4624f, 22.0f, 16.5f)
                curveTo(22.0f, 19.5376f, 19.5376f, 22.0f, 16.5f, 22.0f)
                close()
                moveTo(15.25f, 13.0f)
                curveTo(15.6642f, 13.0f, 16.0f, 13.3358f, 16.0f, 13.75f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 18.0f, 19.0f, 18.3358f, 19.0f, 18.75f)
                curveTo(19.0f, 19.1642f, 18.6642f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(15.25f)
                curveTo(14.8358f, 19.5f, 14.5f, 19.1642f, 14.5f, 18.75f)
                verticalLineTo(13.75f)
                curveTo(14.5f, 13.3358f, 14.8358f, 13.0f, 15.25f, 13.0f)
                close()
            }
        }
            .build()
        return _airbudsLeft!!
    }

private var _airbudsLeft: ImageVector? = null
