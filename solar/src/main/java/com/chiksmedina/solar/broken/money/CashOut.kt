package com.chiksmedina.solar.broken.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MoneyGroup

public val MoneyGroup.CashOut: ImageVector
    get() {
        if (_cashOut != null) {
            return _cashOut!!
        }
        _cashOut = Builder(name = "CashOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8889f, 3.75f)
                curveTo(6.3031f, 3.75f, 6.6389f, 3.4142f, 6.6389f, 3.0f)
                curveTo(6.6389f, 2.5858f, 6.3031f, 2.25f, 5.8889f, 2.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(10.0f, 2.25f)
                curveTo(9.5858f, 2.25f, 9.25f, 2.5858f, 9.25f, 3.0f)
                curveTo(9.25f, 3.4142f, 9.5858f, 3.75f, 10.0f, 3.75f)
                verticalLineTo(2.25f)
                close()
                moveTo(18.1111f, 3.75f)
                curveTo(19.8214f, 3.75f, 21.25f, 5.1905f, 21.25f, 7.0204f)
                horizontalLineTo(22.75f)
                curveTo(22.75f, 4.4095f, 20.6964f, 2.25f, 18.1111f, 2.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(5.8889f, 2.25f)
                curveTo(3.3036f, 2.25f, 1.25f, 4.4095f, 1.25f, 7.0204f)
                horizontalLineTo(2.75f)
                curveTo(2.75f, 5.1905f, 4.1786f, 3.75f, 5.8889f, 3.75f)
                verticalLineTo(2.25f)
                close()
                moveTo(21.25f, 7.0204f)
                curveTo(21.25f, 8.6873f, 20.0607f, 10.0357f, 18.557f, 10.2581f)
                lineTo(18.7764f, 11.7419f)
                curveTo(21.0419f, 11.4069f, 22.75f, 9.4042f, 22.75f, 7.0204f)
                horizontalLineTo(21.25f)
                close()
                moveTo(5.443f, 10.2581f)
                curveTo(3.9393f, 10.0357f, 2.75f, 8.6873f, 2.75f, 7.0204f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 9.4042f, 2.9581f, 11.4069f, 5.2236f, 11.7419f)
                lineTo(5.443f, 10.2581f)
                close()
                moveTo(10.0f, 3.75f)
                horizontalLineTo(18.1111f)
                verticalLineTo(2.25f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                verticalLineTo(14.0f)
                moveTo(12.0f, 14.0f)
                lineTo(14.0f, 11.6667f)
                moveTo(12.0f, 14.0f)
                lineTo(10.0f, 11.6667f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 17.0f)
                horizontalLineTo(13.0f)
                moveTo(19.0f, 17.0f)
                horizontalLineTo(17.0f)
            }
        }
        .build()
        return _cashOut!!
    }

private var _cashOut: ImageVector? = null
