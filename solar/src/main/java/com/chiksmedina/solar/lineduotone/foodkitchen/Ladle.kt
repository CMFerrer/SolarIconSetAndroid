package com.chiksmedina.solar.lineduotone.foodkitchen

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
import com.chiksmedina.solar.lineduotone.FoodKitchenGroup

val FoodKitchenGroup.Ladle: ImageVector
    get() {
        if (_ladle != null) {
            return _ladle!!
        }
        _ladle = Builder(
            name = "Ladle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 5.6842f)
                curveTo(2.0f, 3.6495f, 3.6495f, 2.0f, 5.6842f, 2.0f)
                curveTo(7.7189f, 2.0f, 9.3684f, 3.6495f, 9.3684f, 5.6842f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 14.5f)
                verticalLineTo(15.6842f)
                curveTo(22.0f, 19.1723f, 19.1723f, 22.0f, 15.6842f, 22.0f)
                curveTo(12.1961f, 22.0f, 9.3684f, 19.1723f, 9.3684f, 15.6842f)
                verticalLineTo(14.6316f)
                moveTo(22.0f, 14.5f)
                curveTo(22.0f, 15.8807f, 19.0539f, 17.0f, 16.0f, 17.0f)
                curveTo(12.9461f, 17.0f, 9.3684f, 16.0123f, 9.3684f, 14.6316f)
                moveTo(22.0f, 14.5f)
                curveTo(22.0f, 13.1193f, 19.0539f, 12.0f, 16.0f, 12.0f)
                curveTo(12.9461f, 12.0f, 9.3684f, 13.2509f, 9.3684f, 14.6316f)
            }
        }
            .build()
        return _ladle!!
    }

private var _ladle: ImageVector? = null
