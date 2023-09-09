package com.chiksmedina.solar.broken.security

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
import com.chiksmedina.solar.broken.SecurityGroup

public val SecurityGroup.EyeScan: ImageVector
    get() {
        if (_eyeScan != null) {
            return _eyeScan!!
        }
        _eyeScan = Builder(name = "EyeScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                curveTo(22.0f, 18.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(6.2288f, 2.0f, 4.3432f, 2.0f, 3.1716f, 3.1716f)
                curveTo(2.0f, 4.3432f, 2.0f, 5.2288f, 2.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveTo(9.0727f, 7.0f, 7.0804f, 8.5622f, 5.8924f, 9.9402f)
                curveTo(5.2975f, 10.6303f, 5.0f, 10.9754f, 5.0f, 12.0f)
                curveTo(5.0f, 13.0246f, 5.2975f, 13.3697f, 5.8924f, 14.0598f)
                curveTo(7.0804f, 15.4378f, 9.0727f, 17.0f, 12.0f, 17.0f)
                curveTo(14.9273f, 17.0f, 16.9196f, 15.4378f, 18.1076f, 14.0598f)
                curveTo(18.7025f, 13.3697f, 19.0f, 13.0246f, 19.0f, 12.0f)
                curveTo(19.0f, 10.9754f, 18.7025f, 10.6303f, 18.1076f, 9.9402f)
                curveTo(17.5723f, 9.3193f, 16.8738f, 8.6611f, 16.0f, 8.1251f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                curveTo(9.6508f, 22.0f, 9.3178f, 22.0f, 9.0f, 21.9991f)
                moveTo(2.0f, 15.0f)
                curveTo(2.0f, 18.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(3.8247f, 21.4816f, 4.6999f, 21.7706f, 6.0f, 21.8985f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                curveTo(14.3492f, 2.0f, 14.6822f, 2.0f, 15.0f, 2.0009f)
                moveTo(22.0f, 9.0f)
                curveTo(22.0f, 5.2288f, 22.0f, 4.3432f, 20.8284f, 3.1716f)
                curveTo(20.1752f, 2.5184f, 19.3001f, 2.2294f, 18.0f, 2.1015f)
            }
        }
        .build()
        return _eyeScan!!
    }

private var _eyeScan: ImageVector? = null
