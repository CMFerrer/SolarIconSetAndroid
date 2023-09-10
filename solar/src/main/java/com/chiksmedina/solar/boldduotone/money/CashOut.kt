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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.9996f, 20.0f)
                horizontalLineTo(14.9996f)
                curveTo(16.8852f, 20.0f, 17.828f, 20.0f, 18.4138f, 19.4142f)
                curveTo(18.8853f, 18.9427f, 18.9773f, 18.2398f, 18.9952f, 17.0f)
                horizontalLineTo(5.0039f)
                curveTo(5.0218f, 18.2398f, 5.1138f, 18.9427f, 5.5854f, 19.4142f)
                curveTo(6.1711f, 20.0f, 7.1139f, 20.0f, 8.9996f, 20.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.25f, 6.0f)
                horizontalLineTo(9.0f)
                curveTo(7.1144f, 6.0f, 6.1716f, 6.0f, 5.5858f, 6.5858f)
                curveTo(5.0f, 7.1716f, 5.0f, 8.1144f, 5.0f, 10.0f)
                verticalLineTo(16.0f)
                curveTo(5.0f, 16.3677f, 5.0f, 16.6996f, 5.0044f, 17.0f)
                horizontalLineTo(18.9957f)
                curveTo(19.0f, 16.6996f, 19.0f, 16.3677f, 19.0f, 16.0f)
                verticalLineTo(10.0f)
                curveTo(19.0f, 8.1144f, 19.0f, 7.1716f, 18.4142f, 6.5858f)
                curveTo(17.8284f, 6.0f, 16.8856f, 6.0f, 15.0f, 6.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.9726f)
                lineTo(13.4306f, 10.1786f)
                curveTo(13.7001f, 9.8641f, 14.1736f, 9.8277f, 14.4881f, 10.0972f)
                curveTo(14.8026f, 10.3668f, 14.839f, 10.8403f, 14.5694f, 11.1548f)
                lineTo(12.5694f, 13.4881f)
                curveTo(12.427f, 13.6543f, 12.2189f, 13.75f, 12.0f, 13.75f)
                curveTo(11.7811f, 13.75f, 11.573f, 13.6543f, 11.4306f, 13.4881f)
                lineTo(9.4306f, 11.1548f)
                curveTo(9.161f, 10.8403f, 9.1974f, 10.3668f, 9.5119f, 10.0972f)
                curveTo(9.8264f, 9.8277f, 10.2999f, 9.8641f, 10.5694f, 10.1786f)
                lineTo(11.25f, 10.9726f)
                verticalLineTo(6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.1111f, 3.0f)
                horizontalLineTo(5.8889f)
                curveTo(3.7411f, 3.0f, 2.0f, 4.8f, 2.0f, 7.0204f)
                curveTo(2.0f, 8.9246f, 3.2806f, 10.5196f, 5.0f, 10.9352f)
                verticalLineTo(10.0f)
                curveTo(5.0f, 8.1144f, 5.0f, 7.1716f, 5.5858f, 6.5858f)
                curveTo(6.1716f, 6.0f, 7.1144f, 6.0f, 9.0f, 6.0f)
                horizontalLineTo(11.25f)
                horizontalLineTo(12.75f)
                horizontalLineTo(15.0f)
                curveTo(16.8856f, 6.0f, 17.8284f, 6.0f, 18.4142f, 6.5858f)
                curveTo(19.0f, 7.1716f, 19.0f, 8.1144f, 19.0f, 10.0f)
                verticalLineTo(10.9352f)
                curveTo(20.7194f, 10.5196f, 22.0f, 8.9246f, 22.0f, 7.0204f)
                curveTo(22.0f, 4.8f, 20.2589f, 3.0f, 18.1111f, 3.0f)
                close()
            }
        }
            .build()
        return _cashOut!!
    }

private var _cashOut: ImageVector? = null
