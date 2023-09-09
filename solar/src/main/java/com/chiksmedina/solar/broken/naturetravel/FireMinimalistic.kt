package com.chiksmedina.solar.broken.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.NatureTravelGroup

public val NatureTravelGroup.FireMinimalistic: ImageVector
    get() {
        if (_fireMinimalistic != null) {
            return _fireMinimalistic!!
        }
        _fireMinimalistic = Builder(name = "FireMinimalistic", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 19.9972f)
                curveTo(14.8233f, 20.635f, 13.4571f, 21.0f, 12.0f, 21.0f)
                curveTo(7.5817f, 21.0f, 4.0f, 17.6439f, 4.0f, 13.504f)
                curveTo(4.0f, 12.3727f, 4.1492f, 11.3124f, 4.4053f, 10.3284f)
                moveTo(19.1761f, 16.8211f)
                curveTo(19.7036f, 15.8211f, 20.0f, 14.695f, 20.0f, 13.504f)
                curveTo(20.0f, 9.7626f, 17.9654f, 6.8381f, 16.562f, 5.4444f)
                curveTo(16.3017f, 5.1858f, 15.8683f, 5.3001f, 15.7212f, 5.6329f)
                curveTo(14.9742f, 7.3229f, 13.4178f, 9.7561f, 11.4286f, 9.7561f)
                curveTo(10.1975f, 9.9209f, 8.3169f, 8.8684f, 9.8348f, 3.6487f)
                curveTo(9.9715f, 3.1787f, 9.4697f, 2.8011f, 9.0864f, 3.1154f)
                curveTo(8.0934f, 3.9297f, 6.9505f, 5.1206f, 6.0f, 6.6474f)
            }
        }
        .build()
        return _fireMinimalistic!!
    }

private var _fireMinimalistic: ImageVector? = null
