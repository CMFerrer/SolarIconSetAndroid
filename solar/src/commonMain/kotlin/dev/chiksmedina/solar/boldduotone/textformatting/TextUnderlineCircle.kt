package dev.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.TextFormattingGroup

val TextFormattingGroup.TextUnderlineCircle: ImageVector
    get() {
        if (_textUnderlineCircle != null) {
            return _textUnderlineCircle!!
        }
        _textUnderlineCircle = Builder(
            name = "TextUnderlineCircle", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.25f, 17.0f)
                curveTo(7.25f, 16.5858f, 7.5858f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 16.25f, 16.75f, 16.5858f, 16.75f, 17.0f)
                curveTo(16.75f, 17.4142f, 16.4142f, 17.75f, 16.0f, 17.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 17.75f, 7.25f, 17.4142f, 7.25f, 17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.75f, 7.0f)
                curveTo(8.75f, 6.5858f, 8.4142f, 6.25f, 8.0f, 6.25f)
                curveTo(7.5858f, 6.25f, 7.25f, 6.5858f, 7.25f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(7.25f, 12.6234f, 9.3766f, 14.75f, 12.0f, 14.75f)
                curveTo(14.6234f, 14.75f, 16.75f, 12.6234f, 16.75f, 10.0f)
                verticalLineTo(7.0f)
                curveTo(16.75f, 6.5858f, 16.4142f, 6.25f, 16.0f, 6.25f)
                curveTo(15.5858f, 6.25f, 15.25f, 6.5858f, 15.25f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(15.25f, 11.7949f, 13.7949f, 13.25f, 12.0f, 13.25f)
                curveTo(10.2051f, 13.25f, 8.75f, 11.7949f, 8.75f, 10.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
            .build()
        return _textUnderlineCircle!!
    }

private var _textUnderlineCircle: ImageVector? = null
