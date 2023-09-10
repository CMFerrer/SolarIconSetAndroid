package com.chiksmedina.solar.linear.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MoneyGroup

val MoneyGroup.CashOut: ImageVector
    get() {
        if (_cashOut != null) {
            return _cashOut!!
        }
        _cashOut = Builder(
            name = "CashOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.6667f, 11.0f)
                curveTo(20.5513f, 10.7213f, 22.0f, 9.0457f, 22.0f, 7.0204f)
                curveTo(22.0f, 4.8f, 20.2589f, 3.0f, 18.1111f, 3.0f)
                horizontalLineTo(5.8889f)
                curveTo(3.7411f, 3.0f, 2.0f, 4.8f, 2.0f, 7.0204f)
                curveTo(2.0f, 9.0457f, 3.4487f, 10.7213f, 5.3333f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 6.0f)
                verticalLineTo(13.0f)
                moveTo(12.0f, 13.0f)
                lineTo(14.0f, 10.6667f)
                moveTo(12.0f, 13.0f)
                lineTo(10.0f, 10.6667f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 10.0f)
                curveTo(5.0f, 8.1144f, 5.0f, 7.1716f, 5.5858f, 6.5858f)
                curveTo(6.1716f, 6.0f, 7.1144f, 6.0f, 9.0f, 6.0f)
                horizontalLineTo(15.0f)
                curveTo(16.8856f, 6.0f, 17.8284f, 6.0f, 18.4142f, 6.5858f)
                curveTo(19.0f, 7.1716f, 19.0f, 8.1144f, 19.0f, 10.0f)
                verticalLineTo(16.0f)
                curveTo(19.0f, 17.8856f, 19.0f, 18.8284f, 18.4142f, 19.4142f)
                curveTo(17.8284f, 20.0f, 16.8856f, 20.0f, 15.0f, 20.0f)
                horizontalLineTo(9.0f)
                curveTo(7.1144f, 20.0f, 6.1716f, 20.0f, 5.5858f, 19.4142f)
                curveTo(5.0f, 18.8284f, 5.0f, 17.8856f, 5.0f, 16.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 17.0f)
                horizontalLineTo(19.0f)
            }
        }
            .build()
        return _cashOut!!
    }

private var _cashOut: ImageVector? = null
