package dev.chiksmedina.solar.broken.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.ArrowsGroup

val ArrowsGroup.DoubleAltArrowLeft: ImageVector
    get() {
        if (_doubleAltArrowLeft != null) {
            return _doubleAltArrowLeft!!
        }
        _doubleAltArrowLeft = Builder(
            name = "DoubleAltArrowLeft", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 19.0f)
                lineTo(7.0f, 12.0f)
                lineTo(8.5f, 10.25f)
                moveTo(13.0f, 5.0f)
                lineTo(11.0f, 7.3333f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 5.0f)
                lineTo(11.0f, 12.0f)
                lineTo(12.5f, 13.75f)
                moveTo(17.0f, 19.0f)
                lineTo(15.0f, 16.6667f)
            }
        }
            .build()
        return _doubleAltArrowLeft!!
    }

private var _doubleAltArrowLeft: ImageVector? = null
