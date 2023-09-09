package com.chiksmedina.solar.boldduotone.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.UsersGroup

public val UsersGroup.UserMinus: ImageVector
    get() {
        if (_userMinus != null) {
            return _userMinus!!
        }
        _userMinus = Builder(name = "UserMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                curveTo(16.0f, 8.2091f, 14.2091f, 10.0f, 12.0f, 10.0f)
                curveTo(9.7909f, 10.0f, 8.0f, 8.2091f, 8.0f, 6.0f)
                curveTo(8.0f, 3.7909f, 9.7909f, 2.0f, 12.0f, 2.0f)
                curveTo(14.2091f, 2.0f, 16.0f, 3.7909f, 16.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.4774f, 21.9208f)
                curveTo(13.7513f, 21.9728f, 12.9296f, 22.0f, 12.0f, 22.0f)
                curveTo(4.0f, 22.0f, 4.0f, 19.9853f, 4.0f, 17.5f)
                curveTo(4.0f, 15.0147f, 7.5817f, 13.0f, 12.0f, 13.0f)
                curveTo(14.8806f, 13.0f, 17.4056f, 13.8564f, 18.8142f, 15.1412f)
                curveTo(18.298f, 15.0f, 17.5737f, 15.0f, 16.5f, 15.0f)
                curveTo(14.8501f, 15.0f, 14.0251f, 15.0f, 13.5126f, 15.5126f)
                curveTo(13.0f, 16.0251f, 13.0f, 16.8501f, 13.0f, 18.5f)
                curveTo(13.0f, 20.1499f, 13.0f, 20.9749f, 13.5126f, 21.4874f)
                curveTo(13.7501f, 21.725f, 14.0547f, 21.8524f, 14.4774f, 21.9208f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
        }
        .build()
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
