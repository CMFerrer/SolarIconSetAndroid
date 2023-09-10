package com.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.EssentionalUiGroup

val EssentionalUiGroup._4k: ImageVector
    get() {
        if (__4k != null) {
            return __4k!!
        }
        __4k = Builder(
            name = "_4k", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(5.5f, 11.1046f, 6.3954f, 12.0f, 7.5f, 12.0f)
                horizontalLineTo(10.5f)
                moveTo(10.5f, 8.0f)
                verticalLineTo(12.0f)
                moveTo(10.5f, 12.0f)
                verticalLineTo(16.0f)
                moveTo(13.5f, 8.0f)
                verticalLineTo(13.2f)
                moveTo(13.5f, 13.2f)
                verticalLineTo(16.0f)
                moveTo(13.5f, 13.2f)
                lineTo(15.4231f, 11.2f)
                moveTo(15.4231f, 11.2f)
                lineTo(18.5f, 8.0f)
                moveTo(15.4231f, 11.2f)
                lineTo(18.5f, 16.0f)
            }
        }
            .build()
        return __4k!!
    }

private var __4k: ImageVector? = null
