package com.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.outline.ArrowsActionGroup

public val ArrowsActionGroup.SquareBottomUp: ImageVector
    get() {
        if (_squareBottomUp != null) {
            return _squareBottomUp!!
        }
        _squareBottomUp = Builder(name = "SquareBottomUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9425f, 1.25f)
                curveTo(9.6341f, 1.25f, 7.8251f, 1.25f, 6.4136f, 1.4397f)
                curveTo(4.9689f, 1.634f, 3.8289f, 2.0393f, 2.9341f, 2.9341f)
                curveTo(2.1056f, 3.7626f, 1.6961f, 4.8019f, 1.4859f, 6.1006f)
                curveTo(1.2793f, 7.3774f, 1.2541f, 8.9835f, 1.2505f, 10.9986f)
                curveTo(1.2498f, 11.4129f, 1.5849f, 11.7493f, 1.9991f, 11.75f)
                curveTo(2.4134f, 11.7507f, 2.7497f, 11.4156f, 2.7505f, 11.0014f)
                curveTo(2.7542f, 8.9614f, 2.7824f, 7.4783f, 2.9667f, 6.3403f)
                curveTo(3.1473f, 5.2243f, 3.4661f, 4.5234f, 3.9947f, 3.9948f)
                curveTo(4.5644f, 3.4251f, 5.3351f, 3.0982f, 6.6135f, 2.9264f)
                curveTo(7.9135f, 2.7516f, 9.6217f, 2.75f, 11.9999f, 2.75f)
                curveTo(14.3781f, 2.75f, 16.0864f, 2.7516f, 17.3863f, 2.9264f)
                curveTo(18.6647f, 3.0982f, 19.4355f, 3.4251f, 20.0051f, 3.9948f)
                curveTo(20.5748f, 4.5644f, 20.9017f, 5.3352f, 21.0735f, 6.6136f)
                curveTo(21.2483f, 7.9136f, 21.2499f, 9.6218f, 21.2499f, 12.0f)
                curveTo(21.2499f, 14.3782f, 21.2483f, 16.0864f, 21.0735f, 17.3864f)
                curveTo(20.9017f, 18.6648f, 20.5748f, 19.4355f, 20.0051f, 20.0052f)
                curveTo(19.4765f, 20.5338f, 18.7756f, 20.8526f, 17.6596f, 21.0333f)
                curveTo(16.5216f, 21.2175f, 15.0385f, 21.2457f, 12.9986f, 21.2494f)
                curveTo(12.5843f, 21.2502f, 12.2492f, 21.5866f, 12.2499f, 22.0008f)
                curveTo(12.2507f, 22.415f, 12.587f, 22.7502f, 13.0013f, 22.7494f)
                curveTo(15.0164f, 22.7458f, 16.6225f, 22.7207f, 17.8993f, 22.514f)
                curveTo(19.198f, 22.3038f, 20.2374f, 21.8943f, 21.0658f, 21.0659f)
                curveTo(21.9606f, 20.1711f, 22.3659f, 19.031f, 22.5602f, 17.5863f)
                curveTo(22.7499f, 16.1748f, 22.7499f, 14.3658f, 22.7499f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(22.7499f, 9.6342f, 22.7499f, 7.8252f, 22.5602f, 6.4137f)
                curveTo(22.3659f, 4.969f, 21.9606f, 3.8289f, 21.0658f, 2.9341f)
                curveTo(20.171f, 2.0393f, 19.0309f, 1.634f, 17.5862f, 1.4397f)
                curveTo(16.1747f, 1.25f, 14.3657f, 1.25f, 12.0573f, 1.25f)
                horizontalLineTo(11.9425f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.25f)
                curveTo(4.5858f, 12.25f, 4.25f, 12.5858f, 4.25f, 13.0f)
                curveTo(4.25f, 13.4142f, 4.5858f, 13.75f, 5.0f, 13.75f)
                horizontalLineTo(9.1893f)
                lineTo(2.4697f, 20.4697f)
                curveTo(2.1768f, 20.7626f, 2.1768f, 21.2374f, 2.4697f, 21.5303f)
                curveTo(2.7626f, 21.8232f, 3.2374f, 21.8232f, 3.5303f, 21.5303f)
                lineTo(10.25f, 14.8107f)
                verticalLineTo(19.0f)
                curveTo(10.25f, 19.4142f, 10.5858f, 19.75f, 11.0f, 19.75f)
                curveTo(11.4142f, 19.75f, 11.75f, 19.4142f, 11.75f, 19.0f)
                verticalLineTo(13.0f)
                curveTo(11.75f, 12.5858f, 11.4142f, 12.25f, 11.0f, 12.25f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _squareBottomUp!!
    }

private var _squareBottomUp: ImageVector? = null
