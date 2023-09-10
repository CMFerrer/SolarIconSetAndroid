package com.chiksmedina.solar.broken.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ArrowsGroup

val ArrowsGroup.DoubleAltArrowDown: ImageVector
    get() {
        if (_doubleAltArrowDown != null) {
            return _doubleAltArrowDown!!
        }
        _doubleAltArrowDown = Builder(
            name = "DoubleAltArrowDown", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 11.0f)
                lineTo(12.0f, 17.0f)
                lineTo(10.25f, 15.5f)
                moveTo(5.0f, 11.0f)
                lineTo(7.3333f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 7.0f)
                lineTo(12.0f, 13.0f)
                lineTo(13.75f, 11.5f)
                moveTo(19.0f, 7.0f)
                lineTo(16.6667f, 9.0f)
            }
        }
            .build()
        return _doubleAltArrowDown!!
    }

private var _doubleAltArrowDown: ImageVector? = null
