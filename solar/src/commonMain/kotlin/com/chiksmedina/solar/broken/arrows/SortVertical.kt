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

val ArrowsGroup.SortVertical: ImageVector
    get() {
        if (_sortVertical != null) {
            return _sortVertical!!
        }
        _sortVertical = Builder(
            name = "SortVertical", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 18.0f)
                lineTo(16.0f, 16.0f)
                moveTo(16.0f, 6.0f)
                lineTo(20.0f, 10.125f)
                moveTo(16.0f, 6.0f)
                lineTo(12.0f, 10.125f)
                moveTo(16.0f, 6.0f)
                lineTo(16.0f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 18.0f)
                lineTo(12.0f, 13.875f)
                moveTo(8.0f, 18.0f)
                lineTo(4.0f, 13.875f)
                moveTo(8.0f, 18.0f)
                lineTo(8.0f, 11.0f)
                moveTo(8.0f, 6.0f)
                verticalLineTo(8.0f)
            }
        }
            .build()
        return _sortVertical!!
    }

private var _sortVertical: ImageVector? = null
