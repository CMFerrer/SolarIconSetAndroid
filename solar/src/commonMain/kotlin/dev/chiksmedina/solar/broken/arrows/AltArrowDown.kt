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

val ArrowsGroup.AltArrowDown: ImageVector
    get() {
        if (_altArrowDown != null) {
            return _altArrowDown!!
        }
        _altArrowDown = Builder(
            name = "AltArrowDown", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 9.0f)
                lineTo(12.0f, 15.0f)
                lineTo(10.25f, 13.5f)
                moveTo(5.0f, 9.0f)
                lineTo(7.3333f, 11.0f)
            }
        }
            .build()
        return _altArrowDown!!
    }

private var _altArrowDown: ImageVector? = null
