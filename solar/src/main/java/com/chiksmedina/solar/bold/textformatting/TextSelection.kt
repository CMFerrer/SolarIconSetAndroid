package com.chiksmedina.solar.bold.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TextFormattingGroup

public val TextFormattingGroup.TextSelection: ImageVector
    get() {
        if (_textSelection != null) {
            return _textSelection!!
        }
        _textSelection = Builder(name = "TextSelection", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.8599f, 3.2631f)
                curveTo(5.5665f, 2.5232f, 4.8443f, 2.0f, 4.0f, 2.0f)
                curveTo(2.8954f, 2.0f, 2.0f, 2.8954f, 2.0f, 4.0f)
                curveTo(2.0f, 4.8443f, 2.5232f, 5.5665f, 3.2631f, 5.8599f)
                curveTo(3.2545f, 5.9053f, 3.25f, 5.9521f, 3.25f, 6.0f)
                lineTo(3.25f, 18.0f)
                curveTo(3.25f, 18.0479f, 3.2545f, 18.0947f, 3.2631f, 18.1401f)
                curveTo(2.5232f, 18.4335f, 2.0f, 19.1557f, 2.0f, 20.0f)
                curveTo(2.0f, 21.1046f, 2.8954f, 22.0f, 4.0f, 22.0f)
                curveTo(4.8443f, 22.0f, 5.5665f, 21.4768f, 5.8599f, 20.7369f)
                curveTo(5.9053f, 20.7455f, 5.9521f, 20.75f, 6.0f, 20.75f)
                horizontalLineTo(18.0f)
                curveTo(18.0479f, 20.75f, 18.0947f, 20.7455f, 18.1401f, 20.7369f)
                curveTo(18.4335f, 21.4768f, 19.1557f, 22.0f, 20.0f, 22.0f)
                curveTo(21.1046f, 22.0f, 22.0f, 21.1046f, 22.0f, 20.0f)
                curveTo(22.0f, 19.1557f, 21.4768f, 18.4335f, 20.7369f, 18.1401f)
                curveTo(20.7455f, 18.0947f, 20.75f, 18.0479f, 20.75f, 18.0f)
                lineTo(20.75f, 6.0f)
                curveTo(20.75f, 5.9521f, 20.7455f, 5.9053f, 20.7369f, 5.8599f)
                curveTo(21.4768f, 5.5665f, 22.0f, 4.8443f, 22.0f, 4.0f)
                curveTo(22.0f, 2.8954f, 21.1046f, 2.0f, 20.0f, 2.0f)
                curveTo(19.1557f, 2.0f, 18.4335f, 2.5232f, 18.1401f, 3.2631f)
                curveTo(18.0947f, 3.2545f, 18.0479f, 3.25f, 18.0f, 3.25f)
                horizontalLineTo(6.0f)
                curveTo(5.9521f, 3.25f, 5.9053f, 3.2545f, 5.8599f, 3.2631f)
                close()
                moveTo(4.7369f, 5.8599f)
                curveTo(4.7455f, 5.9053f, 4.75f, 5.9521f, 4.75f, 6.0f)
                lineTo(4.75f, 18.0f)
                curveTo(4.75f, 18.0479f, 4.7455f, 18.0947f, 4.7369f, 18.1401f)
                curveTo(5.2488f, 18.3431f, 5.6569f, 18.7512f, 5.8599f, 19.2631f)
                curveTo(5.9053f, 19.2545f, 5.9521f, 19.25f, 6.0f, 19.25f)
                horizontalLineTo(18.0f)
                curveTo(18.0479f, 19.25f, 18.0947f, 19.2545f, 18.1401f, 19.2631f)
                curveTo(18.3431f, 18.7512f, 18.7512f, 18.3431f, 19.2631f, 18.1401f)
                curveTo(19.2545f, 18.0947f, 19.25f, 18.0479f, 19.25f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(19.25f, 5.9521f, 19.2545f, 5.9053f, 19.2631f, 5.8599f)
                curveTo(18.7512f, 5.6569f, 18.3431f, 5.2488f, 18.1401f, 4.7369f)
                curveTo(18.0947f, 4.7455f, 18.0479f, 4.75f, 18.0f, 4.75f)
                horizontalLineTo(6.0f)
                curveTo(5.9521f, 4.75f, 5.9053f, 4.7455f, 5.8599f, 4.7369f)
                curveTo(5.6569f, 5.2488f, 5.2488f, 5.6569f, 4.7369f, 5.8599f)
                close()
            }
        }
        .build()
        return _textSelection!!
    }

private var _textSelection: ImageVector? = null
