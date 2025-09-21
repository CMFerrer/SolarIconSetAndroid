package dev.chiksmedina.solar.broken.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MedicineGroup

val MedicineGroup.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(
            name = "Pulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 15.0f)
                horizontalLineTo(6.3945f)
                curveTo(7.1804f, 15.0f, 7.5734f, 15.0f, 7.905f, 15.1775f)
                curveTo(8.2367f, 15.355f, 8.4546f, 15.682f, 8.8906f, 16.3359f)
                lineTo(9.0504f, 16.5756f)
                curveTo(9.4731f, 17.2096f, 9.6844f, 17.5266f, 9.9709f, 17.5096f)
                curveTo(10.2573f, 17.4926f, 10.4297f, 17.1528f, 10.7743f, 16.4732f)
                lineTo(12.7404f, 12.5965f)
                curveTo(13.0987f, 11.8899f, 13.2779f, 11.5366f, 13.5711f, 11.5248f)
                curveTo(13.8642f, 11.5131f, 14.0711f, 11.8509f, 14.485f, 12.5265f)
                lineTo(15.1222f, 13.567f)
                curveTo(15.5512f, 14.2672f, 15.7656f, 14.6174f, 16.1072f, 14.8087f)
                curveTo(16.4487f, 15.0f, 16.8593f, 15.0f, 17.6805f, 15.0f)
                horizontalLineTo(19.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(21.5093f, 4.4382f, 21.8356f, 5.8066f, 21.9449f, 8.0f)
            }
        }
            .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
