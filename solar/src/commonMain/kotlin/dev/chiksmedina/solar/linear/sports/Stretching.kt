package dev.chiksmedina.solar.linear.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.SportsGroup

val SportsGroup.Stretching: ImageVector
    get() {
        if (_stretching != null) {
            return _stretching!!
        }
        _stretching = Builder(
            name = "Stretching", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 4.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 21.9998f)
                lineTo(8.8486f, 20.6269f)
                curveTo(9.3044f, 20.4644f, 9.6858f, 20.142f, 9.922f, 19.7197f)
                lineTo(12.6343f, 14.8715f)
                curveTo(12.8012f, 14.5731f, 12.8889f, 14.2369f, 12.8889f, 13.895f)
                verticalLineTo(11.2746f)
                curveTo(12.8889f, 10.1977f, 11.7878f, 9.4717f, 10.798f, 9.8959f)
                lineTo(8.3422f, 10.9483f)
                curveTo(7.3594f, 11.3696f, 7.1203f, 12.6546f, 7.8859f, 13.401f)
                lineTo(8.5f, 13.9998f)
                moveTo(19.0f, 21.9998f)
                verticalLineTo(16.7677f)
                curveTo(19.0f, 15.5351f, 17.8958f, 14.5958f, 16.6792f, 14.7936f)
                lineTo(15.6667f, 14.9581f)
            }
        }
            .build()
        return _stretching!!
    }

private var _stretching: ImageVector? = null
