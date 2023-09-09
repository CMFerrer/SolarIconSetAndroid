package com.chiksmedina.solar.broken.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MapLocationGroup

public val MapLocationGroup.MapArrowSquare: ImageVector
    get() {
        if (_mapArrowSquare != null) {
            return _mapArrowSquare!!
        }
        _mapArrowSquare = Builder(name = "MapArrowSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.4907f, 4.4382f, 2.1644f, 5.8066f, 2.0551f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5193f, 14.5f)
                lineTo(13.4227f, 17.3618f)
                curveTo(13.1045f, 18.1922f, 11.94f, 18.2192f, 11.6917f, 17.4019f)
                lineTo(10.6352f, 13.9249f)
                curveTo(10.553f, 13.6545f, 10.3455f, 13.447f, 10.0751f, 13.3648f)
                lineTo(6.5981f, 12.3083f)
                curveTo(5.7808f, 12.06f, 5.8078f, 10.8955f, 6.6382f, 10.5773f)
                lineTo(15.804f, 7.0652f)
                curveTo(16.5389f, 6.7836f, 17.2164f, 7.4611f, 16.9348f, 8.196f)
                lineTo(15.9678f, 10.7197f)
            }
        }
        .build()
        return _mapArrowSquare!!
    }

private var _mapArrowSquare: ImageVector? = null
