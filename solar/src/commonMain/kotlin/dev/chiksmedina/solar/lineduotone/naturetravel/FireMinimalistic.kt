package dev.chiksmedina.solar.lineduotone.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.NatureTravelGroup

val NatureTravelGroup.FireMinimalistic: ImageVector
    get() {
        if (_fireMinimalistic != null) {
            return _fireMinimalistic!!
        }
        _fireMinimalistic = Builder(
            name = "FireMinimalistic", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 21.0f)
                curveTo(16.4183f, 21.0f, 20.0f, 17.6439f, 20.0f, 13.504f)
                curveTo(20.0f, 9.7626f, 17.9654f, 6.8381f, 16.562f, 5.4444f)
                curveTo(16.3017f, 5.1858f, 15.8683f, 5.3001f, 15.7212f, 5.6329f)
                curveTo(14.9742f, 7.3229f, 13.4178f, 9.7561f, 11.4286f, 9.7561f)
                curveTo(10.1975f, 9.9209f, 8.3169f, 8.8684f, 9.8348f, 3.6487f)
                curveTo(9.9715f, 3.1787f, 9.4697f, 2.8011f, 9.0864f, 3.1154f)
                curveTo(6.9046f, 4.9044f, 4.0f, 8.5114f, 4.0f, 13.504f)
                curveTo(4.0f, 17.6439f, 7.5817f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
            .build()
        return _fireMinimalistic!!
    }

private var _fireMinimalistic: ImageVector? = null
