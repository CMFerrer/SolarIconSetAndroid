package com.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.MoneyGroup

public val MoneyGroup.WadOfMoney: ImageVector
    get() {
        if (_wadOfMoney != null) {
            return _wadOfMoney!!
        }
        _wadOfMoney = Builder(name = "WadOfMoney", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 5.0005f)
                curveTo(5.9326f, 5.0059f, 4.6925f, 5.0629f, 3.7777f, 5.6741f)
                curveTo(3.341f, 5.966f, 2.966f, 6.341f, 2.6741f, 6.7777f)
                curveTo(2.0f, 7.7866f, 2.0f, 9.1911f, 2.0f, 12.0f)
                curveTo(2.0f, 14.8089f, 2.0f, 16.2134f, 2.6741f, 17.2223f)
                curveTo(2.966f, 17.659f, 3.341f, 18.034f, 3.7777f, 18.3259f)
                curveTo(4.6925f, 18.9371f, 5.9326f, 18.9941f, 8.25f, 18.9995f)
                verticalLineTo(14.9055f)
                curveTo(6.9561f, 14.5725f, 6.0f, 13.3979f, 6.0f, 12.0f)
                curveTo(6.0f, 10.6021f, 6.9561f, 9.4276f, 8.25f, 9.0945f)
                verticalLineTo(5.0005f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 19.0f)
                lineTo(14.25f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.75f)
                verticalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 5.0005f)
                verticalLineTo(9.0945f)
                curveTo(17.0439f, 9.4276f, 18.0f, 10.6021f, 18.0f, 12.0f)
                curveTo(18.0f, 13.3979f, 17.0439f, 14.5725f, 15.75f, 14.9055f)
                verticalLineTo(18.9995f)
                curveTo(18.0674f, 18.9941f, 19.3075f, 18.9371f, 20.2223f, 18.3259f)
                curveTo(20.659f, 18.034f, 21.034f, 17.659f, 21.3259f, 17.2223f)
                curveTo(22.0f, 16.2134f, 22.0f, 14.8089f, 22.0f, 12.0f)
                curveTo(22.0f, 9.1911f, 22.0f, 7.7866f, 21.3259f, 6.7777f)
                curveTo(21.034f, 6.341f, 20.659f, 5.966f, 20.2223f, 5.6741f)
                curveTo(19.3075f, 5.0629f, 18.0674f, 5.0059f, 15.75f, 5.0005f)
                close()
            }
        }
        .build()
        return _wadOfMoney!!
    }

private var _wadOfMoney: ImageVector? = null
