package com.chiksmedina.solar.outline.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.UsersGroup

val UsersGroup.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = Builder(
            name = "UserCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.25f, 9.0f)
                curveTo(8.25f, 6.9289f, 9.9289f, 5.25f, 12.0f, 5.25f)
                curveTo(14.0711f, 5.25f, 15.75f, 6.9289f, 15.75f, 9.0f)
                curveTo(15.75f, 11.0711f, 14.0711f, 12.75f, 12.0f, 12.75f)
                curveTo(9.9289f, 12.75f, 8.25f, 11.0711f, 8.25f, 9.0f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(10.7574f, 6.75f, 9.75f, 7.7574f, 9.75f, 9.0f)
                curveTo(9.75f, 10.2426f, 10.7574f, 11.25f, 12.0f, 11.25f)
                curveTo(13.2426f, 11.25f, 14.25f, 10.2426f, 14.25f, 9.0f)
                curveTo(14.25f, 7.7574f, 13.2426f, 6.75f, 12.0f, 6.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 14.5456f, 3.7783f, 16.851f, 5.4421f, 18.5235f)
                curveTo(5.6225f, 17.5504f, 5.9769f, 16.6329f, 6.6884f, 15.8951f)
                curveTo(7.7525f, 14.7915f, 9.4542f, 14.25f, 12.0f, 14.25f)
                curveTo(14.5457f, 14.25f, 16.2474f, 14.7915f, 17.3115f, 15.8951f)
                curveTo(18.023f, 16.6329f, 18.3774f, 17.5505f, 18.5578f, 18.5236f)
                curveTo(20.2217f, 16.8511f, 21.25f, 14.5456f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(17.1937f, 19.6554f)
                curveTo(17.0918f, 18.4435f, 16.8286f, 17.5553f, 16.2318f, 16.9363f)
                curveTo(15.5823f, 16.2628f, 14.3789f, 15.75f, 12.0f, 15.75f)
                curveTo(9.621f, 15.75f, 8.4176f, 16.2628f, 7.7681f, 16.9363f)
                curveTo(7.1713f, 17.5553f, 6.9081f, 18.4434f, 6.8062f, 19.6553f)
                curveTo(8.2868f, 20.6618f, 10.0747f, 21.25f, 12.0f, 21.25f)
                curveTo(13.9252f, 21.25f, 15.7131f, 20.6618f, 17.1937f, 19.6554f)
                close()
            }
        }
            .build()
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
