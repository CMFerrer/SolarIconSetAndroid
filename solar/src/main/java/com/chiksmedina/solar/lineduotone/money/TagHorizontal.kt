package com.chiksmedina.solar.lineduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MoneyGroup

val MoneyGroup.TagHorizontal: ImageVector
    get() {
        if (_tagHorizontal != null) {
            return _tagHorizontal!!
        }
        _tagHorizontal = Builder(
            name = "TagHorizontal", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.721f, 20.0f)
                horizontalLineTo(12.358f)
                curveTo(14.5854f, 20.0f, 15.6992f, 20.0f, 16.6289f, 19.4672f)
                curveTo(17.5586f, 18.9345f, 18.1488f, 17.958f, 19.3294f, 16.005f)
                lineTo(20.0102f, 14.8787f)
                curveTo(21.0034f, 13.2357f, 21.5f, 12.4142f, 21.5f, 11.5f)
                curveTo(21.5f, 10.5858f, 21.0034f, 9.7643f, 20.0102f, 8.1213f)
                lineTo(19.3294f, 6.995f)
                curveTo(18.1488f, 5.042f, 17.5586f, 4.0655f, 16.6289f, 3.5328f)
                curveTo(15.6992f, 3.0f, 14.5854f, 3.0f, 12.358f, 3.0f)
                horizontalLineTo(9.721f)
                curveTo(5.8456f, 3.0f, 3.9079f, 3.0f, 2.7039f, 4.2448f)
                curveTo(1.5f, 5.4896f, 1.5f, 7.4931f, 1.5f, 11.5f)
                curveTo(1.5f, 15.5069f, 1.5f, 17.5104f, 2.7039f, 18.7552f)
                curveTo(3.9079f, 20.0f, 5.8456f, 20.0f, 9.721f, 20.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.5f, 6.9951f)
                verticalLineTo(16.0f)
            }
        }
            .build()
        return _tagHorizontal!!
    }

private var _tagHorizontal: ImageVector? = null
