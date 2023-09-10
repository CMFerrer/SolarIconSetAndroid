package com.chiksmedina.solar.boldduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MoneyGroup

val MoneyGroup.WadOfMoney: ImageVector
    get() {
        if (_wadOfMoney != null) {
            return _wadOfMoney!!
        }
        _wadOfMoney = Builder(
            name = "WadOfMoney", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.25f, 18.9999f)
                horizontalLineTo(15.75f)
                curveTo(18.0674f, 18.9946f, 19.3075f, 18.9376f, 20.2223f, 18.3263f)
                curveTo(20.659f, 18.0345f, 21.034f, 17.6595f, 21.3259f, 17.2227f)
                curveTo(22.0f, 16.2138f, 22.0f, 14.8094f, 22.0f, 12.0004f)
                curveTo(22.0f, 9.1915f, 22.0f, 7.787f, 21.3259f, 6.7782f)
                curveTo(21.034f, 6.3414f, 20.659f, 5.9664f, 20.2223f, 5.6746f)
                curveTo(19.3075f, 5.0633f, 18.0674f, 5.0063f, 15.75f, 5.001f)
                horizontalLineTo(14.25f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                curveTo(16.6569f, 9.0f, 18.0f, 10.3431f, 18.0f, 12.0f)
                curveTo(18.0f, 13.6569f, 16.6569f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(14.25f)
                verticalLineTo(18.9999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.75f, 18.9999f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                curveTo(7.3432f, 15.0f, 6.0f, 13.6569f, 6.0f, 12.0f)
                curveTo(6.0f, 10.3431f, 7.3432f, 9.0f, 9.0f, 9.0f)
                horizontalLineTo(9.75f)
                verticalLineTo(5.001f)
                horizontalLineTo(8.25f)
                curveTo(5.9326f, 5.0063f, 4.6925f, 5.0633f, 3.7777f, 5.6746f)
                curveTo(3.341f, 5.9664f, 2.966f, 6.3414f, 2.6741f, 6.7782f)
                curveTo(2.0f, 7.787f, 2.0f, 9.1915f, 2.0f, 12.0004f)
                curveTo(2.0f, 14.8094f, 2.0f, 16.2138f, 2.6741f, 17.2227f)
                curveTo(2.966f, 17.6595f, 3.341f, 18.0345f, 3.7777f, 18.3263f)
                curveTo(4.6925f, 18.9376f, 5.9326f, 18.9946f, 8.25f, 18.9999f)
                horizontalLineTo(9.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.75f, 19.0f)
                lineTo(14.25f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.75f)
                verticalLineTo(19.0f)
                close()
            }
        }
            .build()
        return _wadOfMoney!!
    }

private var _wadOfMoney: ImageVector? = null
