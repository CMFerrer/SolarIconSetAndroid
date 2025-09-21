package dev.chiksmedina.solar.bold.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SecurityGroup

val SecurityGroup.KeyMinimalisticSquare: ImageVector
    get() {
        if (_keyMinimalisticSquare != null) {
            return _keyMinimalisticSquare!!
        }
        _keyMinimalisticSquare = Builder(
            name = "KeyMinimalisticSquare", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.3905f, 9.7238f)
                curveTo(12.9112f, 9.2031f, 13.7554f, 9.2031f, 14.2761f, 9.7238f)
                curveTo(14.7968f, 10.2445f, 14.7968f, 11.0887f, 14.2761f, 11.6094f)
                curveTo(13.7554f, 12.1301f, 12.9112f, 12.1301f, 12.3905f, 11.6094f)
                curveTo(11.8698f, 11.0887f, 11.8698f, 10.2445f, 12.3905f, 9.7238f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(16.6514f, 7.3486f)
                curveTo(18.4495f, 9.1468f, 18.4495f, 12.0621f, 16.6514f, 13.8603f)
                curveTo(15.4574f, 15.0542f, 13.7709f, 15.4554f, 12.2459f, 15.0638f)
                curveTo(12.0f, 15.0006f, 11.7342f, 15.0565f, 11.5546f, 15.2361f)
                lineTo(10.4371f, 16.3536f)
                lineTo(10.4342f, 16.3507f)
                lineTo(9.2681f, 15.1975f)
                curveTo(8.9736f, 14.9062f, 8.4988f, 14.9088f, 8.2075f, 15.2033f)
                curveTo(7.9162f, 15.4978f, 7.9188f, 15.9727f, 8.2133f, 16.264f)
                lineTo(9.3764f, 17.4143f)
                lineTo(9.0797f, 17.711f)
                curveTo(8.8678f, 17.9229f, 8.571f, 18.0271f, 8.2731f, 17.994f)
                lineTo(6.8807f, 17.8392f)
                curveTo(6.7322f, 17.8228f, 6.5938f, 17.7562f, 6.4882f, 17.6506f)
                lineTo(6.3494f, 17.5118f)
                curveTo(6.2438f, 17.4062f, 6.1772f, 17.2678f, 6.1607f, 17.1193f)
                lineTo(6.006f, 15.7269f)
                curveTo(5.9729f, 15.429f, 6.0771f, 15.1322f, 6.289f, 14.9203f)
                lineTo(8.7637f, 12.4456f)
                curveTo(8.9433f, 12.266f, 8.9994f, 12.0f, 8.9362f, 11.7541f)
                curveTo(8.5446f, 10.2291f, 8.9458f, 8.5426f, 10.1397f, 7.3486f)
                curveTo(11.9379f, 5.5505f, 14.8532f, 5.5505f, 16.6514f, 7.3486f)
                close()
            }
        }
            .build()
        return _keyMinimalisticSquare!!
    }

private var _keyMinimalisticSquare: ImageVector? = null
