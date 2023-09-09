package com.chiksmedina.solar.lineduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.ArrowsGroup

public val ArrowsGroup.SortHorizontal: ImageVector
    get() {
        if (_sortHorizontal != null) {
            return _sortHorizontal!!
        }
        _sortHorizontal = Builder(name = "SortHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                moveTo(6.0f, 8.0f)
                lineTo(10.125f, 4.0f)
                moveTo(6.0f, 8.0f)
                lineTo(10.125f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 16.0f)
                lineTo(18.0f, 16.0f)
                moveTo(18.0f, 16.0f)
                lineTo(13.875f, 12.0f)
                moveTo(18.0f, 16.0f)
                lineTo(13.875f, 20.0f)
            }
        }
        .build()
        return _sortHorizontal!!
    }

private var _sortHorizontal: ImageVector? = null
