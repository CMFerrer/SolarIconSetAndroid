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

val MoneyGroup.Card: ImageVector
    get() {
        if (_card != null) {
            return _card!!
        }
        _card = Builder(
            name = "Card", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.9998f, 20.0f)
                horizontalLineTo(13.9998f)
                curveTo(17.771f, 20.0f, 19.6566f, 20.0f, 20.8282f, 18.8284f)
                curveTo(21.9998f, 17.6569f, 21.9998f, 15.7712f, 21.9998f, 12.0f)
                curveTo(21.9998f, 11.5581f, 21.9981f, 10.392f, 21.9962f, 10.0f)
                horizontalLineTo(2.0f)
                curveTo(1.9981f, 10.392f, 1.9998f, 11.5581f, 1.9998f, 12.0f)
                curveTo(1.9998f, 15.7712f, 1.9998f, 17.6569f, 3.1713f, 18.8284f)
                curveTo(4.3429f, 20.0f, 6.2285f, 20.0f, 9.9998f, 20.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.9948f, 4.0f)
                horizontalLineTo(14.0052f)
                curveTo(17.7861f, 4.0f, 19.6766f, 4.0f, 20.8512f, 5.1158f)
                curveTo(21.6969f, 5.9192f, 21.9337f, 7.0751f, 22.0f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                curveTo(2.0663f, 7.0751f, 2.3031f, 5.9192f, 3.1488f, 5.1158f)
                curveTo(4.3234f, 4.0f, 6.2139f, 4.0f, 9.9948f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.5f, 15.25f)
                curveTo(12.0858f, 15.25f, 11.75f, 15.5858f, 11.75f, 16.0f)
                curveTo(11.75f, 16.4142f, 12.0858f, 16.75f, 12.5f, 16.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 16.75f, 14.75f, 16.4142f, 14.75f, 16.0f)
                curveTo(14.75f, 15.5858f, 14.4142f, 15.25f, 14.0f, 15.25f)
                horizontalLineTo(12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 15.25f)
                curveTo(5.5858f, 15.25f, 5.25f, 15.5858f, 5.25f, 16.0f)
                curveTo(5.25f, 16.4142f, 5.5858f, 16.75f, 6.0f, 16.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 16.75f, 10.75f, 16.4142f, 10.75f, 16.0f)
                curveTo(10.75f, 15.5858f, 10.4142f, 15.25f, 10.0f, 15.25f)
                horizontalLineTo(6.0f)
                close()
            }
        }
            .build()
        return _card!!
    }

private var _card: ImageVector? = null
