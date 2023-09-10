package com.chiksmedina.solar.bold.users

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
import com.chiksmedina.solar.bold.UsersGroup

val UsersGroup.UserMinus: ImageVector
    get() {
        if (_userMinus != null) {
            return _userMinus!!
        }
        _userMinus = Builder(
            name = "UserMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.5126f, 21.4874f)
                curveTo(14.0251f, 22.0f, 14.8501f, 22.0f, 16.5f, 22.0f)
                curveTo(18.1499f, 22.0f, 18.9749f, 22.0f, 19.4874f, 21.4874f)
                curveTo(20.0f, 20.9749f, 20.0f, 20.1499f, 20.0f, 18.5f)
                curveTo(20.0f, 16.8501f, 20.0f, 16.0251f, 19.4874f, 15.5126f)
                curveTo(18.9749f, 15.0f, 18.1499f, 15.0f, 16.5f, 15.0f)
                curveTo(14.8501f, 15.0f, 14.0251f, 15.0f, 13.5126f, 15.5126f)
                curveTo(13.0f, 16.0251f, 13.0f, 16.8501f, 13.0f, 18.5f)
                curveTo(13.0f, 20.1499f, 13.0f, 20.9749f, 13.5126f, 21.4874f)
                close()
                moveTo(15.9167f, 17.9167f)
                horizontalLineTo(14.9444f)
                curveTo(14.6223f, 17.9167f, 14.3611f, 18.1778f, 14.3611f, 18.5f)
                curveTo(14.3611f, 18.8222f, 14.6223f, 19.0833f, 14.9444f, 19.0833f)
                horizontalLineTo(15.9167f)
                horizontalLineTo(17.0833f)
                horizontalLineTo(18.0556f)
                curveTo(18.3777f, 19.0833f, 18.6389f, 18.8222f, 18.6389f, 18.5f)
                curveTo(18.6389f, 18.1778f, 18.3777f, 17.9167f, 18.0556f, 17.9167f)
                horizontalLineTo(17.0833f)
                horizontalLineTo(15.9167f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.6782f, 13.5028f)
                curveTo(15.2051f, 13.5085f, 14.7642f, 13.5258f, 14.3799f, 13.5774f)
                curveTo(13.737f, 13.6639f, 13.0334f, 13.8705f, 12.4519f, 14.4519f)
                curveTo(11.8705f, 15.0333f, 11.6639f, 15.737f, 11.5775f, 16.3799f)
                curveTo(11.4998f, 16.9576f, 11.4999f, 17.6635f, 11.5f, 18.414f)
                verticalLineTo(18.586f)
                curveTo(11.4999f, 19.3365f, 11.4998f, 20.0424f, 11.5775f, 20.6201f)
                curveTo(11.6381f, 21.0712f, 11.7579f, 21.5522f, 12.0249f, 22.0f)
                curveTo(12.0166f, 22.0f, 12.0083f, 22.0f, 12.0f, 22.0f)
                curveTo(4.0f, 22.0f, 4.0f, 19.9853f, 4.0f, 17.5f)
                curveTo(4.0f, 15.0147f, 7.5817f, 13.0f, 12.0f, 13.0f)
                curveTo(13.3262f, 13.0f, 14.577f, 13.1815f, 15.6782f, 13.5028f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 6.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
        }
            .build()
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
