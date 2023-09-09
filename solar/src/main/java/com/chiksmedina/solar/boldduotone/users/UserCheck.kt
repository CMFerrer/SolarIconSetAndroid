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

public val UsersGroup.UserCheck: ImageVector
    get() {
        if (_userCheck != null) {
            return _userCheck!!
        }
        _userCheck = Builder(name = "UserCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 22.0f)
                curveTo(14.8501f, 22.0f, 14.0251f, 22.0f, 13.5126f, 21.4874f)
                curveTo(13.0f, 20.9749f, 13.0f, 20.1499f, 13.0f, 18.5f)
                curveTo(13.0f, 16.8501f, 13.0f, 16.0251f, 13.5126f, 15.5126f)
                curveTo(14.0251f, 15.0f, 14.8501f, 15.0f, 16.5f, 15.0f)
                curveTo(18.1499f, 15.0f, 18.9749f, 15.0f, 19.4874f, 15.5126f)
                curveTo(20.0f, 16.0251f, 20.0f, 16.8501f, 20.0f, 18.5f)
                curveTo(20.0f, 20.1499f, 20.0f, 20.9749f, 19.4874f, 21.4874f)
                curveTo(18.9749f, 22.0f, 18.1499f, 22.0f, 16.5f, 22.0f)
                close()
                moveTo(18.468f, 17.7458f)
                curveTo(18.6958f, 17.518f, 18.6958f, 17.1487f, 18.468f, 16.9209f)
                curveTo(18.2402f, 16.693f, 17.8709f, 16.693f, 17.6431f, 16.9209f)
                lineTo(15.7222f, 18.8417f)
                lineTo(15.3569f, 18.4764f)
                curveTo(15.1291f, 18.2486f, 14.7598f, 18.2486f, 14.532f, 18.4764f)
                curveTo(14.3042f, 18.7042f, 14.3042f, 19.0736f, 14.532f, 19.3014f)
                lineTo(15.3097f, 20.0791f)
                curveTo(15.5375f, 20.307f, 15.9069f, 20.307f, 16.1347f, 20.0791f)
                lineTo(18.468f, 17.7458f)
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
        }
        .build()
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
