package dev.chiksmedina.solar.boldduotone.textformatting

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
import dev.chiksmedina.solar.boldduotone.TextFormattingGroup

val TextFormattingGroup.TextSelection: ImageVector
    get() {
        if (_textSelection != null) {
            return _textSelection!!
        }
        _textSelection = Builder(
            name = "TextSelection", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.25f, 9.0f)
                curveTo(8.25f, 8.5858f, 8.5858f, 8.25f, 9.0f, 8.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 8.25f, 15.75f, 8.5858f, 15.75f, 9.0f)
                curveTo(15.75f, 9.4142f, 15.4142f, 9.75f, 15.0f, 9.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.0f)
                curveTo(12.75f, 15.4142f, 12.4142f, 15.75f, 12.0f, 15.75f)
                curveTo(11.5858f, 15.75f, 11.25f, 15.4142f, 11.25f, 15.0f)
                verticalLineTo(9.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 9.75f, 8.25f, 9.4142f, 8.25f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0f, 6.0f)
                curveTo(5.1046f, 6.0f, 6.0f, 5.1046f, 6.0f, 4.0f)
                curveTo(6.0f, 2.8954f, 5.1046f, 2.0f, 4.0f, 2.0f)
                curveTo(2.8954f, 2.0f, 2.0f, 2.8954f, 2.0f, 4.0f)
                curveTo(2.0f, 5.1046f, 2.8954f, 6.0f, 4.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0f, 22.0f)
                curveTo(5.1046f, 22.0f, 6.0f, 21.1046f, 6.0f, 20.0f)
                curveTo(6.0f, 18.8954f, 5.1046f, 18.0f, 4.0f, 18.0f)
                curveTo(2.8954f, 18.0f, 2.0f, 18.8954f, 2.0f, 20.0f)
                curveTo(2.0f, 21.1046f, 2.8954f, 22.0f, 4.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 4.0f)
                curveTo(22.0f, 5.1046f, 21.1046f, 6.0f, 20.0f, 6.0f)
                curveTo(18.8954f, 6.0f, 18.0f, 5.1046f, 18.0f, 4.0f)
                curveTo(18.0f, 2.8954f, 18.8954f, 2.0f, 20.0f, 2.0f)
                curveTo(21.1046f, 2.0f, 22.0f, 2.8954f, 22.0f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 22.0f)
                curveTo(21.1046f, 22.0f, 22.0f, 21.1046f, 22.0f, 20.0f)
                curveTo(22.0f, 18.8954f, 21.1046f, 18.0f, 20.0f, 18.0f)
                curveTo(18.8954f, 18.0f, 18.0f, 18.8954f, 18.0f, 20.0f)
                curveTo(18.0f, 21.1046f, 18.8954f, 22.0f, 20.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.75f, 5.8546f)
                curveTo(4.5184f, 5.9484f, 4.2652f, 6.0f, 4.0f, 6.0f)
                curveTo(3.7348f, 6.0f, 3.4816f, 5.9484f, 3.25f, 5.8546f)
                verticalLineTo(18.1454f)
                curveTo(3.4816f, 18.0516f, 3.7348f, 18.0f, 4.0f, 18.0f)
                curveTo(4.2652f, 18.0f, 4.5184f, 18.0516f, 4.75f, 18.1454f)
                verticalLineTo(5.8546f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.8546f, 4.75f)
                horizontalLineTo(18.1454f)
                curveTo(18.0516f, 4.5184f, 18.0f, 4.2652f, 18.0f, 4.0f)
                curveTo(18.0f, 3.7348f, 18.0516f, 3.4816f, 18.1454f, 3.25f)
                horizontalLineTo(5.8546f)
                curveTo(5.9484f, 3.4816f, 6.0f, 3.7348f, 6.0f, 4.0f)
                curveTo(6.0f, 4.2652f, 5.9484f, 4.5184f, 5.8546f, 4.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.25f, 5.8546f)
                curveTo(19.4816f, 5.9484f, 19.7348f, 6.0f, 20.0f, 6.0f)
                curveTo(20.2652f, 6.0f, 20.5184f, 5.9484f, 20.75f, 5.8546f)
                verticalLineTo(18.1454f)
                curveTo(20.5184f, 18.0516f, 20.2652f, 18.0f, 20.0f, 18.0f)
                curveTo(19.7348f, 18.0f, 19.4816f, 18.0516f, 19.25f, 18.1454f)
                verticalLineTo(5.8546f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.1454f, 19.25f)
                horizontalLineTo(5.8546f)
                curveTo(5.9484f, 19.4816f, 6.0f, 19.7348f, 6.0f, 20.0f)
                curveTo(6.0f, 20.2652f, 5.9484f, 20.5184f, 5.8546f, 20.75f)
                horizontalLineTo(18.1454f)
                curveTo(18.0516f, 20.5184f, 18.0f, 20.2652f, 18.0f, 20.0f)
                curveTo(18.0f, 19.7348f, 18.0516f, 19.4816f, 18.1454f, 19.25f)
                close()
            }
        }
            .build()
        return _textSelection!!
    }

private var _textSelection: ImageVector? = null
