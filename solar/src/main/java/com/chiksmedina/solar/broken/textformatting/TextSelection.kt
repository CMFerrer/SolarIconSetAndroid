package com.chiksmedina.solar.broken.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.TextFormattingGroup

public val TextFormattingGroup.TextSelection: ImageVector
    get() {
        if (_textSelection != null) {
            return _textSelection!!
        }
        _textSelection = Builder(name = "TextSelection", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                horizontalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                lineTo(12.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                curveTo(6.0f, 5.1046f, 5.1046f, 6.0f, 4.0f, 6.0f)
                curveTo(2.8954f, 6.0f, 2.0f, 5.1046f, 2.0f, 4.0f)
                curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
                curveTo(5.1046f, 2.0f, 6.0f, 2.8954f, 6.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 20.0f)
                curveTo(6.0f, 21.1046f, 5.1046f, 22.0f, 4.0f, 22.0f)
                curveTo(2.8954f, 22.0f, 2.0f, 21.1046f, 2.0f, 20.0f)
                curveTo(2.0f, 18.8954f, 2.8954f, 18.0f, 4.0f, 18.0f)
                curveTo(5.1046f, 18.0f, 6.0f, 18.8954f, 6.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                curveTo(22.0f, 5.1046f, 21.1046f, 6.0f, 20.0f, 6.0f)
                curveTo(18.8954f, 6.0f, 18.0f, 5.1046f, 18.0f, 4.0f)
                curveTo(18.0f, 2.8954f, 18.8954f, 2.0f, 20.0f, 2.0f)
                curveTo(21.1046f, 2.0f, 22.0f, 2.8954f, 22.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                curveTo(22.0f, 21.1046f, 21.1046f, 22.0f, 20.0f, 22.0f)
                curveTo(18.8954f, 22.0f, 18.0f, 21.1046f, 18.0f, 20.0f)
                curveTo(18.0f, 18.8954f, 18.8954f, 18.0f, 20.0f, 18.0f)
                curveTo(21.1046f, 18.0f, 22.0f, 18.8954f, 22.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                horizontalLineTo(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                lineTo(20.0f, 12.0f)
                moveTo(20.0f, 6.0f)
                verticalLineTo(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                lineTo(12.0f, 20.0f)
                moveTo(6.0f, 20.0f)
                lineTo(8.0f, 20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineTo(4.0f, 18.0f)
            }
        }
        .build()
        return _textSelection!!
    }

private var _textSelection: ImageVector? = null
