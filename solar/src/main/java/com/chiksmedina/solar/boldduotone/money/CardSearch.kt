package com.chiksmedina.solar.boldduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.MoneyGroup

public val MoneyGroup.CardSearch: ImageVector
    get() {
        if (_cardSearch != null) {
            return _cardSearch!!
        }
        _cardSearch = Builder(name = "CardSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 20.0f)
                horizontalLineTo(13.6266f)
                curveTo(12.9211f, 19.1061f, 12.5f, 17.9772f, 12.5f, 16.75f)
                curveTo(12.5f, 13.8505f, 14.8505f, 11.5f, 17.75f, 11.5f)
                curveTo(19.4947f, 11.5f, 21.0406f, 12.3511f, 21.9953f, 13.6607f)
                curveTo(22.0f, 13.1517f, 22.0f, 12.5997f, 22.0f, 12.0f)
                curveTo(22.0f, 11.5581f, 22.0f, 10.392f, 21.9981f, 10.0f)
                horizontalLineTo(2.0019f)
                curveTo(2.0f, 10.392f, 2.0f, 11.5581f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 16.0f)
                curveTo(5.25f, 15.5858f, 5.5858f, 15.25f, 6.0f, 15.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 15.25f, 10.75f, 15.5858f, 10.75f, 16.0f)
                curveTo(10.75f, 16.4142f, 10.4142f, 16.75f, 10.0f, 16.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 16.75f, 5.25f, 16.4142f, 5.25f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.75f, 14.5f)
                curveTo(16.5074f, 14.5f, 15.5f, 15.5074f, 15.5f, 16.75f)
                curveTo(15.5f, 17.9926f, 16.5074f, 19.0f, 17.75f, 19.0f)
                curveTo(18.9926f, 19.0f, 20.0f, 17.9926f, 20.0f, 16.75f)
                curveTo(20.0f, 15.5074f, 18.9926f, 14.5f, 17.75f, 14.5f)
                close()
                moveTo(14.0f, 16.75f)
                curveTo(14.0f, 14.6789f, 15.6789f, 13.0f, 17.75f, 13.0f)
                curveTo(19.8211f, 13.0f, 21.5f, 14.6789f, 21.5f, 16.75f)
                curveTo(21.5f, 17.5143f, 21.2713f, 18.2252f, 20.8787f, 18.818f)
                lineTo(21.7803f, 19.7197f)
                curveTo(22.0732f, 20.0126f, 22.0732f, 20.4874f, 21.7803f, 20.7803f)
                curveTo(21.4874f, 21.0732f, 21.0126f, 21.0732f, 20.7197f, 20.7803f)
                lineTo(19.818f, 19.8787f)
                curveTo(19.2252f, 20.2713f, 18.5143f, 20.5f, 17.75f, 20.5f)
                curveTo(15.6789f, 20.5f, 14.0f, 18.8211f, 14.0f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
        }
        .build()
        return _cardSearch!!
    }

private var _cardSearch: ImageVector? = null
