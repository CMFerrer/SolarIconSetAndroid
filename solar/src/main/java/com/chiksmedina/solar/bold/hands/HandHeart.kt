package com.chiksmedina.solar.bold.hands

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
import com.chiksmedina.solar.bold.HandsGroup

public val HandsGroup.HandHeart: ImageVector
    get() {
        if (_handHeart != null) {
            return _handHeart!!
        }
        _handHeart = Builder(name = "HandHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.8294f)
                curveTo(7.0f, 6.3771f, 8.7259f, 8.0076f, 10.1497f, 9.0893f)
                curveTo(10.9489f, 9.6964f, 11.3484f, 10.0f, 12.0f, 10.0f)
                curveTo(12.6516f, 10.0f, 13.0512f, 9.6964f, 13.8503f, 9.0893f)
                curveTo(15.2741f, 8.0076f, 17.0f, 6.3772f, 17.0f, 4.8293f)
                curveTo(17.0f, 2.0392f, 14.2499f, 0.9975f, 12.0f, 3.1528f)
                curveTo(9.7501f, 0.9975f, 7.0f, 2.0392f, 7.0f, 4.8294f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2599f, 21.3884f)
                horizontalLineTo(6.0f)
                curveTo(5.0572f, 21.3884f, 4.5858f, 21.3884f, 4.2929f, 21.0955f)
                curveTo(4.0f, 20.8026f, 4.0f, 20.3312f, 4.0f, 19.3884f)
                verticalLineTo(18.2764f)
                curveTo(4.0f, 17.7579f, 4.0f, 17.4987f, 4.1332f, 17.2672f)
                curveTo(4.2664f, 17.0356f, 4.4673f, 16.9188f, 4.8691f, 16.6851f)
                curveTo(7.5146f, 15.1464f, 11.2715f, 14.2803f, 13.7791f, 15.7759f)
                curveTo(13.9475f, 15.8764f, 14.0991f, 15.9977f, 14.2285f, 16.1431f)
                curveTo(14.7866f, 16.77f, 14.746f, 17.7161f, 14.1028f, 18.2775f)
                curveTo(13.9669f, 18.396f, 13.8222f, 18.486f, 13.6764f, 18.5172f)
                curveTo(13.7962f, 18.5033f, 13.911f, 18.4874f, 14.0206f, 18.4699f)
                curveTo(14.932f, 18.3245f, 15.697f, 17.8375f, 16.3974f, 17.3084f)
                lineTo(18.2046f, 15.9433f)
                curveTo(18.8417f, 15.462f, 19.7873f, 15.4619f, 20.4245f, 15.943f)
                curveTo(20.9982f, 16.3762f, 21.1736f, 17.0894f, 20.8109f, 17.6707f)
                curveTo(20.388f, 18.3487f, 19.7921f, 19.216f, 19.2199f, 19.7459f)
                curveTo(18.6469f, 20.2766f, 17.7939f, 20.7504f, 17.0975f, 21.0865f)
                curveTo(16.326f, 21.4589f, 15.4738f, 21.6734f, 14.6069f, 21.8138f)
                curveTo(12.8488f, 22.0983f, 11.0166f, 22.0549f, 9.2763f, 21.6964f)
                curveTo(8.2925f, 21.4937f, 7.2708f, 21.3884f, 6.2599f, 21.3884f)
                close()
            }
        }
        .build()
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
