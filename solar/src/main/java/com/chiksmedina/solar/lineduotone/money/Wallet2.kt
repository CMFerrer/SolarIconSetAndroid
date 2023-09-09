package com.chiksmedina.solar.lineduotone.money

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
import com.chiksmedina.solar.lineduotone.MoneyGroup

public val MoneyGroup.Wallet2: ImageVector
    get() {
        if (_wallet2 != null) {
            return _wallet2!!
        }
        _wallet2 = Builder(name = "Wallet2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 15.0f)
                lineTo(7.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.8333f, 9.0f)
                horizontalLineTo(18.2308f)
                curveTo(16.4465f, 9.0f, 15.0f, 10.3431f, 15.0f, 12.0f)
                curveTo(15.0f, 13.6569f, 16.4465f, 15.0f, 18.2308f, 15.0f)
                horizontalLineTo(20.8333f)
                curveTo(20.9167f, 15.0f, 20.9583f, 15.0f, 20.9935f, 14.9979f)
                curveTo(21.5328f, 14.965f, 21.9623f, 14.5662f, 21.9977f, 14.0654f)
                curveTo(22.0f, 14.0327f, 22.0f, 13.994f, 22.0f, 13.9167f)
                verticalLineTo(10.0833f)
                curveTo(22.0f, 10.006f, 22.0f, 9.9673f, 21.9977f, 9.9346f)
                curveTo(21.9623f, 9.4338f, 21.5328f, 9.035f, 20.9935f, 9.0021f)
                curveTo(20.9583f, 9.0f, 20.9167f, 9.0f, 20.8333f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.965f, 9.0f)
                curveTo(20.8873f, 7.1277f, 20.6366f, 5.9798f, 19.8284f, 5.1716f)
                curveTo(18.6569f, 4.0f, 16.7712f, 4.0f, 13.0f, 4.0f)
                lineTo(10.0f, 4.0f)
                curveTo(6.2288f, 4.0f, 4.3432f, 4.0f, 3.1716f, 5.1716f)
                curveTo(2.0f, 6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 20.0f, 18.6569f, 20.0f, 19.8284f, 18.8284f)
                curveTo(20.6366f, 18.0203f, 20.8873f, 16.8723f, 20.965f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.991f, 12.0f)
                horizontalLineTo(18.0f)
            }
        }
        .build()
        return _wallet2!!
    }

private var _wallet2: ImageVector? = null
