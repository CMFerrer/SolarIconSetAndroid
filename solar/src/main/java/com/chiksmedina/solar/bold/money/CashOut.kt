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
                moveTo(11.25f, 6.0f)
                horizontalLineTo(9.0f)
                curveTo(7.1144f, 6.0f, 6.1716f, 6.0f, 5.5858f, 6.5858f)
                curveTo(5.0f, 7.1716f, 5.0f, 8.1144f, 5.0f, 10.0f)
                lineTo(5.0001f, 16.25f)
                horizontalLineTo(18.9999f)
                lineTo(19.0f, 10.0f)
                curveTo(19.0f, 8.1144f, 19.0f, 7.1716f, 18.4142f, 6.5858f)
                curveTo(17.8284f, 6.0f, 16.8856f, 6.0f, 15.0f, 6.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.9726f)
                lineTo(13.4306f, 10.1786f)
                curveTo(13.7001f, 9.8641f, 14.1736f, 9.8277f, 14.4881f, 10.0972f)
                curveTo(14.8026f, 10.3668f, 14.839f, 10.8403f, 14.5695f, 11.1548f)
                lineTo(12.5695f, 13.4881f)
                curveTo(12.427f, 13.6543f, 12.219f, 13.75f, 12.0f, 13.75f)
                curveTo(11.7811f, 13.75f, 11.5731f, 13.6543f, 11.4306f, 13.4881f)
                lineTo(9.4306f, 11.1548f)
                curveTo(9.161f, 10.8403f, 9.1974f, 10.3668f, 9.5119f, 10.0972f)
                curveTo(9.8264f, 9.8277f, 10.2999f, 9.8641f, 10.5695f, 10.1786f)
                lineTo(11.25f, 10.9726f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0306f, 17.75f)
                horizontalLineTo(18.9694f)
                curveTo(18.9181f, 18.5406f, 18.781f, 19.0474f, 18.4142f, 19.4142f)
                curveTo(17.8284f, 20.0f, 16.8856f, 20.0f, 15.0f, 20.0f)
                horizontalLineTo(9.0f)
                curveTo(7.1144f, 20.0f, 6.1716f, 20.0f, 5.5858f, 19.4142f)
                curveTo(5.219f, 19.0474f, 5.0819f, 18.5406f, 5.0306f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8889f, 3.0f)
                horizontalLineTo(18.1111f)
                curveTo(20.2589f, 3.0f, 22.0f, 4.8f, 22.0f, 7.0204f)
                curveTo(22.0f, 8.3097f, 21.4129f, 9.4573f, 20.5f, 10.193f)
                lineTo(20.5f, 9.9105f)
                curveTo(20.5001f, 9.0449f, 20.5002f, 8.2512f, 20.4134f, 7.6056f)
                curveTo(20.3178f, 6.8946f, 20.0929f, 6.1432f, 19.4748f, 5.5251f)
                curveTo(18.8568f, 4.9071f, 18.1054f, 4.6822f, 17.3944f, 4.5866f)
                curveTo(16.7488f, 4.4998f, 15.9551f, 4.4999f, 15.0895f, 4.5f)
                horizontalLineTo(8.9105f)
                curveTo(8.0449f, 4.4999f, 7.2512f, 4.4998f, 6.6056f, 4.5866f)
                curveTo(5.8946f, 4.6822f, 5.1431f, 4.9071f, 4.5251f, 5.5251f)
                curveTo(3.9071f, 6.1432f, 3.6822f, 6.8946f, 3.5866f, 7.6056f)
                curveTo(3.4998f, 8.2512f, 3.4999f, 9.0449f, 3.5f, 9.9105f)
                lineTo(3.5f, 10.193f)
                curveTo(2.5871f, 9.4573f, 2.0f, 8.3097f, 2.0f, 7.0204f)
                curveTo(2.0f, 4.8f, 3.7411f, 3.0f, 5.8889f, 3.0f)
                close()
            }
        }
        .build()
        return _cashOut!!
    }

private var _cashOut: ImageVector? = null
