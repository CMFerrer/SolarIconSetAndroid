package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

public val ElectronicDevicesGroup.TurntableMinimalistic: ImageVector
    get() {
        if (_turntableMinimalistic != null) {
            return _turntableMinimalistic!!
        }
        _turntableMinimalistic = Builder(name = "TurntableMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.7501f, 2.2216f)
                verticalLineTo(7.9648f)
                curveTo(17.7501f, 8.5499f, 17.4577f, 9.0963f, 16.9708f, 9.4209f)
                lineTo(14.4161f, 11.124f)
                curveTo(14.0715f, 11.3538f, 13.6058f, 11.2607f, 13.376f, 10.916f)
                curveTo(13.1463f, 10.5714f, 13.2394f, 10.1057f, 13.5841f, 9.876f)
                lineTo(16.1388f, 8.1728f)
                curveTo(16.2083f, 8.1265f, 16.2501f, 8.0484f, 16.2501f, 7.9648f)
                verticalLineTo(2.0687f)
                curveTo(15.0943f, 2.0f, 13.7005f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.8515f, 2.7805f, 18.9728f, 2.4159f, 17.7501f, 2.2216f)
                close()
                moveTo(6.25f, 12.0f)
                curveTo(6.25f, 8.8244f, 8.8244f, 6.25f, 12.0f, 6.25f)
                curveTo(12.5997f, 6.25f, 13.1793f, 6.3421f, 13.7247f, 6.5134f)
                curveTo(14.1199f, 6.6375f, 14.3397f, 7.0585f, 14.2155f, 7.4536f)
                curveTo(14.0914f, 7.8488f, 13.6704f, 8.0686f, 13.2753f, 7.9444f)
                curveTo(12.8736f, 7.8183f, 12.4455f, 7.75f, 12.0f, 7.75f)
                curveTo(9.6528f, 7.75f, 7.75f, 9.6528f, 7.75f, 12.0f)
                curveTo(7.75f, 14.3472f, 9.6528f, 16.25f, 12.0f, 16.25f)
                curveTo(14.3472f, 16.25f, 16.25f, 14.3472f, 16.25f, 12.0f)
                curveTo(16.25f, 11.5858f, 16.5858f, 11.25f, 17.0f, 11.25f)
                curveTo(17.4142f, 11.25f, 17.75f, 11.5858f, 17.75f, 12.0f)
                curveTo(17.75f, 15.1756f, 15.1756f, 17.75f, 12.0f, 17.75f)
                curveTo(8.8244f, 17.75f, 6.25f, 15.1756f, 6.25f, 12.0f)
                close()
                moveTo(10.0f, 11.25f)
                curveTo(10.4142f, 11.25f, 10.75f, 11.5858f, 10.75f, 12.0f)
                curveTo(10.75f, 12.6904f, 11.3096f, 13.25f, 12.0f, 13.25f)
                curveTo(12.4142f, 13.25f, 12.75f, 13.5858f, 12.75f, 14.0f)
                curveTo(12.75f, 14.4142f, 12.4142f, 14.75f, 12.0f, 14.75f)
                curveTo(10.4812f, 14.75f, 9.25f, 13.5188f, 9.25f, 12.0f)
                curveTo(9.25f, 11.5858f, 9.5858f, 11.25f, 10.0f, 11.25f)
                close()
            }
        }
        .build()
        return _turntableMinimalistic!!
    }

private var _turntableMinimalistic: ImageVector? = null
