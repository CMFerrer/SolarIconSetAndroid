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

val ArrowsGroup.TransferHorizontal: ImageVector
    get() {
        if (_transferHorizontal != null) {
            return _transferHorizontal!!
        }
        _transferHorizontal = Builder(
            name = "TransferHorizontal", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 4.0f)
                lineTo(4.0f, 10.0f)
                lineTo(14.0f, 10.0f)
                moveTo(20.0f, 10.0f)
                lineTo(17.5f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 20.0f)
                lineTo(20.0f, 14.0f)
                lineTo(10.0f, 14.0f)
                moveTo(4.0f, 14.0f)
                lineTo(6.5f, 14.0f)
            }
        }
            .build()
        return _transferHorizontal!!
    }

private var _transferHorizontal: ImageVector? = null
