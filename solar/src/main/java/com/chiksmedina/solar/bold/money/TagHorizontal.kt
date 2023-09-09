package com.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MoneyGroup

public val MoneyGroup.TagHorizontal: ImageVector
    get() {
        if (_tagHorizontal != null) {
            return _tagHorizontal!!
        }
        _tagHorizontal = Builder(name = "TagHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.858f, 20.0f)
                horizontalLineTo(10.221f)
                curveTo(6.3456f, 20.0f, 4.4079f, 20.0f, 3.2039f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                curveTo(2.0f, 8.2288f, 2.0f, 6.3432f, 3.2039f, 5.1716f)
                curveTo(4.4079f, 4.0f, 6.3456f, 4.0f, 10.221f, 4.0f)
                horizontalLineTo(12.858f)
                curveTo(15.0854f, 4.0f, 16.1992f, 4.0f, 17.1289f, 4.5014f)
                curveTo(18.0586f, 5.0029f, 18.6488f, 5.9219f, 19.8294f, 7.76f)
                lineTo(20.5102f, 8.82f)
                curveTo(21.5034f, 10.3664f, 22.0f, 11.1396f, 22.0f, 12.0f)
                curveTo(22.0f, 12.8604f, 21.5034f, 13.6336f, 20.5102f, 15.18f)
                lineTo(19.8294f, 16.24f)
                curveTo(18.6488f, 18.0781f, 18.0586f, 18.9971f, 17.1289f, 19.4986f)
                curveTo(16.1992f, 20.0f, 15.0854f, 20.0f, 12.858f, 20.0f)
                close()
                moveTo(7.0f, 7.0542f)
                curveTo(7.4142f, 7.0542f, 7.75f, 7.3703f, 7.75f, 7.7601f)
                verticalLineTo(16.2353f)
                curveTo(7.75f, 16.6251f, 7.4142f, 16.9412f, 7.0f, 16.9412f)
                curveTo(6.5858f, 16.9412f, 6.25f, 16.6251f, 6.25f, 16.2353f)
                verticalLineTo(7.7601f)
                curveTo(6.25f, 7.3703f, 6.5858f, 7.0542f, 7.0f, 7.0542f)
                close()
            }
        }
        .build()
        return _tagHorizontal!!
    }

private var _tagHorizontal: ImageVector? = null
