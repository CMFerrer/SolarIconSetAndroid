package com.chiksmedina.solar.linear.shoppingecommerce

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
import com.chiksmedina.solar.linear.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Bag3: ImageVector
    get() {
        if (_bag3 != null) {
            return _bag3!!
        }
        _bag3 = Builder(
            name = "Bag3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.7417f, 18.5545f)
                curveTo(4.9413f, 20.0f, 7.174f, 20.0f, 11.6394f, 20.0f)
                horizontalLineTo(12.3606f)
                curveTo(16.826f, 20.0f, 19.0587f, 20.0f, 20.2584f, 18.5545f)
                moveTo(3.7417f, 18.5545f)
                curveTo(2.5421f, 17.1091f, 2.9535f, 14.9146f, 3.7764f, 10.5257f)
                curveTo(4.3617f, 7.4045f, 4.6543f, 5.8439f, 5.7652f, 4.922f)
                moveTo(3.7417f, 18.5545f)
                curveTo(3.7417f, 18.5545f, 3.7417f, 18.5545f, 3.7417f, 18.5545f)
                close()
                moveTo(20.2584f, 18.5545f)
                curveTo(21.458f, 17.1091f, 21.0465f, 14.9146f, 20.2236f, 10.5257f)
                curveTo(19.6384f, 7.4045f, 19.3458f, 5.8439f, 18.2349f, 4.922f)
                moveTo(20.2584f, 18.5545f)
                curveTo(20.2583f, 18.5545f, 20.2584f, 18.5545f, 20.2584f, 18.5545f)
                close()
                moveTo(18.2349f, 4.922f)
                curveTo(17.124f, 4.0f, 15.5362f, 4.0f, 12.3606f, 4.0f)
                horizontalLineTo(11.6394f)
                curveTo(8.4639f, 4.0f, 6.8761f, 4.0f, 5.7652f, 4.922f)
                moveTo(18.2349f, 4.922f)
                curveTo(18.2349f, 4.922f, 18.2349f, 4.922f, 18.2349f, 4.922f)
                close()
                moveTo(5.7652f, 4.922f)
                curveTo(5.7652f, 4.922f, 5.7652f, 4.922f, 5.7652f, 4.922f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.1709f, 8.0f)
                curveTo(9.5827f, 9.1652f, 10.694f, 10.0f, 12.0002f, 10.0f)
                curveTo(13.3064f, 10.0f, 14.4177f, 9.1652f, 14.8295f, 8.0f)
            }
        }
            .build()
        return _bag3!!
    }

private var _bag3: ImageVector? = null
