package com.chiksmedina.solar.broken.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MoneyGroup

public val MoneyGroup.CardSend: ImageVector
    get() {
        if (_cardSend != null) {
            return _cardSend!!
        }
        _cardSend = Builder(name = "CardSend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                verticalLineTo(14.0f)
                moveTo(19.0f, 14.0f)
                lineTo(21.0f, 16.0f)
                moveTo(19.0f, 14.0f)
                lineTo(17.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 8.2288f, 22.0f, 6.3432f, 20.8284f, 5.1716f)
                curveTo(19.6569f, 4.0f, 17.7712f, 4.0f, 14.0f, 4.0f)
                moveTo(14.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                curveTo(2.0f, 8.2288f, 2.0f, 6.3432f, 3.1716f, 5.1716f)
                curveTo(4.3432f, 4.0f, 6.2288f, 4.0f, 10.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                horizontalLineTo(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 16.0f)
                horizontalLineTo(12.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                moveTo(22.0f, 10.0f)
                lineTo(11.0f, 10.0f)
            }
        }
        .build()
        return _cardSend!!
    }

private var _cardSend: ImageVector? = null
