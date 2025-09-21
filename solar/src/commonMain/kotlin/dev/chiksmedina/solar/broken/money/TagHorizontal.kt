package dev.chiksmedina.solar.broken.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MoneyGroup

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
                moveTo(13.358f, 21.0f)
                curveTo(15.5854f, 21.0f, 16.6992f, 21.0f, 17.6289f, 20.4672f)
                curveTo(18.5586f, 19.9345f, 19.1488f, 18.958f, 20.3294f, 17.005f)
                lineTo(21.0102f, 15.8787f)
                curveTo(22.0034f, 14.2357f, 22.5f, 13.4142f, 22.5f, 12.5f)
                curveTo(22.5f, 11.5858f, 22.0034f, 10.7643f, 21.0102f, 9.1213f)
                lineTo(20.3294f, 7.995f)
                curveTo(19.1488f, 6.042f, 18.5586f, 5.0655f, 17.6289f, 4.5328f)
                curveTo(16.6992f, 4.0f, 15.5854f, 4.0f, 13.358f, 4.0f)
                horizontalLineTo(10.721f)
                curveTo(9.6826f, 4.0f, 8.7833f, 4.0f, 8.0f, 4.024f)
                moveTo(3.7039f, 5.2448f)
                curveTo(2.5f, 6.4896f, 2.5f, 8.4931f, 2.5f, 12.5f)
                curveTo(2.5f, 16.5069f, 2.5f, 18.5104f, 3.7039f, 19.7552f)
                curveTo(4.7024f, 20.7875f, 6.2055f, 20.9637f, 8.9f, 20.9938f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 7.9951f)
                verticalLineTo(17.0f)
            }
        }
            .build()
        return _tagHorizontal!!
    }

private var _tagHorizontal: ImageVector? = null
