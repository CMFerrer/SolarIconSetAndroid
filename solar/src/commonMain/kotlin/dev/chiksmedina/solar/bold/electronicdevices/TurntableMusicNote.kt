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

val ElectronicDevicesGroup.TurntableMusicNote: ImageVector
    get() {
        if (_turntableMusicNote != null) {
            return _turntableMusicNote!!
        }
        _turntableMusicNote = Builder(
            name = "TurntableMusicNote", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.25f, 11.5f)
                curveTo(19.6642f, 11.5f, 20.0f, 11.8358f, 20.0f, 12.25f)
                curveTo(20.0f, 13.4926f, 21.0074f, 14.5f, 22.25f, 14.5f)
                curveTo(22.6642f, 14.5f, 23.0f, 14.8358f, 23.0f, 15.25f)
                curveTo(23.0f, 15.6642f, 22.6642f, 16.0f, 22.25f, 16.0f)
                curveTo(21.4058f, 16.0f, 20.6267f, 15.721f, 20.0f, 15.2503f)
                verticalLineTo(20.25f)
                curveTo(20.0f, 21.7688f, 18.7688f, 23.0f, 17.25f, 23.0f)
                curveTo(15.7312f, 23.0f, 14.5f, 21.7688f, 14.5f, 20.25f)
                curveTo(14.5f, 18.7312f, 15.7312f, 17.5f, 17.25f, 17.5f)
                curveTo(17.7001f, 17.5f, 18.125f, 17.6081f, 18.5f, 17.7999f)
                verticalLineTo(12.25f)
                curveTo(18.5f, 11.8358f, 18.8358f, 11.5f, 19.25f, 11.5f)
                close()
                moveTo(18.5f, 20.25f)
                curveTo(18.5f, 19.5596f, 17.9404f, 19.0f, 17.25f, 19.0f)
                curveTo(16.5596f, 19.0f, 16.0f, 19.5596f, 16.0f, 20.25f)
                curveTo(16.0f, 20.9404f, 16.5596f, 21.5f, 17.25f, 21.5f)
                curveTo(17.9404f, 21.5f, 18.5f, 20.9404f, 18.5f, 20.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 9.75f)
                curveTo(10.7574f, 9.75f, 9.75f, 10.7574f, 9.75f, 12.0f)
                curveTo(9.75f, 13.2426f, 10.7574f, 14.25f, 12.0f, 14.25f)
                curveTo(13.2426f, 14.25f, 14.25f, 13.2426f, 14.25f, 12.0f)
                curveTo(14.25f, 10.7574f, 13.2426f, 9.75f, 12.0f, 9.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.1716f, 3.4645f)
                curveTo(4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 2.0f, 19.6569f, 2.0f, 20.8284f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 12.3305f, 22.0f, 12.6494f, 21.9996f, 12.9572f)
                curveTo(21.7085f, 12.8541f, 21.5f, 12.5764f, 21.5f, 12.25f)
                curveTo(21.5f, 11.0074f, 20.4926f, 10.0f, 19.25f, 10.0f)
                curveTo(18.0074f, 10.0f, 17.0f, 11.0074f, 17.0f, 12.25f)
                verticalLineTo(16.0072f)
                curveTo(14.7692f, 16.1366f, 13.0f, 17.9867f, 13.0f, 20.25f)
                curveTo(13.0f, 20.8739f, 13.1344f, 21.4663f, 13.3759f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
                moveTo(12.0f, 8.25f)
                curveTo(9.9289f, 8.25f, 8.25f, 9.9289f, 8.25f, 12.0f)
                curveTo(8.25f, 14.0711f, 9.9289f, 15.75f, 12.0f, 15.75f)
                curveTo(14.0711f, 15.75f, 15.75f, 14.0711f, 15.75f, 12.0f)
                curveTo(15.75f, 9.9289f, 14.0711f, 8.25f, 12.0f, 8.25f)
                close()
            }
        }
            .build()
        return _turntableMusicNote!!
    }

private var _turntableMusicNote: ImageVector? = null
