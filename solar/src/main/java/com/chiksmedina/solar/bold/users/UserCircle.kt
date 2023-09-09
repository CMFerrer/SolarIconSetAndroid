package com.chiksmedina.solar.bold.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.UsersGroup

public val UsersGroup.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = Builder(name = "UserCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(15.0f, 9.0f)
                curveTo(15.0f, 10.6569f, 13.6569f, 12.0f, 12.0f, 12.0f)
                curveTo(10.3431f, 12.0f, 9.0f, 10.6569f, 9.0f, 9.0f)
                curveTo(9.0f, 7.3432f, 10.3431f, 6.0f, 12.0f, 6.0f)
                curveTo(13.6569f, 6.0f, 15.0f, 7.3432f, 15.0f, 9.0f)
                close()
                moveTo(12.0f, 20.5f)
                curveTo(13.784f, 20.5f, 15.4397f, 19.9504f, 16.8069f, 19.0112f)
                curveTo(17.4108f, 18.5964f, 17.6688f, 17.8062f, 17.3178f, 17.1632f)
                curveTo(16.59f, 15.8303f, 15.0902f, 15.0f, 11.9999f, 15.0f)
                curveTo(8.9097f, 15.0f, 7.41f, 15.8302f, 6.6821f, 17.1632f)
                curveTo(6.331f, 17.8062f, 6.5891f, 18.5963f, 7.193f, 19.0111f)
                curveTo(8.5602f, 19.9503f, 10.2159f, 20.5f, 12.0f, 20.5f)
                close()
            }
        }
        .build()
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
