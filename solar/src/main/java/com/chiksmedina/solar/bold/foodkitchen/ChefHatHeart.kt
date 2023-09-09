package com.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.FoodKitchenGroup

public val FoodKitchenGroup.ChefHatHeart: ImageVector
    get() {
        if (_chefHatHeart != null) {
            return _chefHatHeart!!
        }
        _chefHatHeart = Builder(name = "ChefHatHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 10.0f)
                curveTo(2.0f, 7.2386f, 4.2386f, 5.0f, 7.0f, 5.0f)
                curveTo(7.2505f, 5.0f, 7.4967f, 5.0184f, 7.7374f, 5.054f)
                curveTo(8.3396f, 3.2781f, 10.0206f, 2.0f, 12.0f, 2.0f)
                curveTo(13.9794f, 2.0f, 15.6604f, 3.2781f, 16.2626f, 5.054f)
                curveTo(16.5033f, 5.0184f, 16.7495f, 5.0f, 17.0f, 5.0f)
                curveTo(19.7614f, 5.0f, 22.0f, 7.2386f, 22.0f, 10.0f)
                curveTo(22.0f, 12.0503f, 20.7659f, 13.8124f, 19.0f, 14.584f)
                lineTo(19.0f, 17.25f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.584f)
                curveTo(3.2341f, 13.8124f, 2.0f, 12.0503f, 2.0f, 10.0f)
                close()
                moveTo(11.0429f, 13.6693f)
                curveTo(10.1649f, 13.0251f, 9.0f, 11.9849f, 9.0f, 11.0004f)
                curveTo(9.0f, 9.3272f, 10.65f, 8.7025f, 12.0f, 9.9951f)
                curveTo(13.35f, 8.7025f, 15.0f, 9.3272f, 15.0f, 11.0004f)
                curveTo(15.0f, 11.9849f, 13.8352f, 13.0251f, 12.9571f, 13.6693f)
                curveTo(12.5374f, 13.9773f, 12.3275f, 14.1313f, 12.0f, 14.1313f)
                curveTo(11.6725f, 14.1313f, 11.4626f, 13.9773f, 11.0429f, 13.6693f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5858f, 21.4142f)
                curveTo(5.0834f, 20.9119f, 5.0119f, 20.1469f, 5.0017f, 18.75f)
                horizontalLineTo(18.9983f)
                curveTo(18.9881f, 20.1469f, 18.9166f, 20.9119f, 18.4142f, 21.4142f)
                curveTo(17.8284f, 22.0f, 16.8856f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(7.1144f, 22.0f, 6.1716f, 22.0f, 5.5858f, 21.4142f)
                close()
            }
        }
        .build()
        return _chefHatHeart!!
    }

private var _chefHatHeart: ImageVector? = null
