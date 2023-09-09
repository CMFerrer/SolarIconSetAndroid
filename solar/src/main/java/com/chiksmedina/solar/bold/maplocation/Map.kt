package com.chiksmedina.solar.bold.maplocation

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
import com.chiksmedina.solar.bold.MapLocationGroup

public val MapLocationGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.4363f, 5.1469f)
                curveTo(2.0f, 5.6434f, 2.0f, 6.4949f, 2.0f, 8.1977f)
                verticalLineTo(17.591f)
                curveTo(2.0f, 18.797f, 2.0f, 19.4f, 2.3146f, 19.854f)
                curveTo(2.6292f, 20.3079f, 3.1792f, 20.4986f, 4.2792f, 20.88f)
                lineTo(5.5734f, 21.3286f)
                curveTo(6.2744f, 21.5717f, 6.8137f, 21.7586f, 7.2663f, 21.879f)
                curveTo(7.5616f, 21.9576f, 7.8333f, 21.7258f, 7.8333f, 21.4203f)
                verticalLineTo(6.2701f)
                curveTo(7.8333f, 6.0212f, 7.6496f, 5.8111f, 7.4084f, 5.7499f)
                curveTo(7.0191f, 5.6512f, 6.5513f, 5.489f, 5.91f, 5.2667f)
                curveTo(4.3568f, 4.7282f, 3.5801f, 4.4589f, 2.9892f, 4.7323f)
                curveTo(2.7794f, 4.8294f, 2.5912f, 4.9705f, 2.4363f, 5.1469f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6204f, 3.481f)
                lineTo(11.0844f, 4.546f)
                curveTo(10.5287f, 4.9312f, 10.1215f, 5.2136f, 9.7738f, 5.4149f)
                curveTo(9.6089f, 5.5103f, 9.5f, 5.6829f, 9.5f, 5.8733f)
                verticalLineTo(20.9203f)
                curveTo(9.5f, 21.2909f, 9.884f, 21.5222f, 10.1962f, 21.3225f)
                curveTo(10.5312f, 21.1082f, 10.9149f, 20.8422f, 11.3796f, 20.5199f)
                lineTo(12.9156f, 19.4549f)
                curveTo(13.4712f, 19.0697f, 13.8785f, 18.7873f, 14.2262f, 18.586f)
                curveTo(14.3911f, 18.4906f, 14.5f, 18.318f, 14.5f, 18.1276f)
                verticalLineTo(3.0806f)
                curveTo(14.5f, 2.71f, 14.116f, 2.4787f, 13.8038f, 2.6784f)
                curveTo(13.4688f, 2.8927f, 13.0851f, 3.1587f, 12.6204f, 3.481f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7208f, 3.1209f)
                lineTo(18.4266f, 2.6723f)
                curveTo(17.7256f, 2.4292f, 17.1863f, 2.2423f, 16.7337f, 2.1219f)
                curveTo(16.4384f, 2.0433f, 16.1667f, 2.2751f, 16.1667f, 2.5806f)
                verticalLineTo(17.7308f)
                curveTo(16.1667f, 17.9797f, 16.3504f, 18.1898f, 16.5916f, 18.251f)
                curveTo(16.9809f, 18.3497f, 17.4488f, 18.5119f, 18.09f, 18.7342f)
                curveTo(19.6432f, 19.2727f, 20.4199f, 19.542f, 21.0108f, 19.2686f)
                curveTo(21.2206f, 19.1715f, 21.4088f, 19.0304f, 21.5637f, 18.854f)
                curveTo(22.0f, 18.3575f, 22.0f, 17.506f, 22.0f, 15.8032f)
                verticalLineTo(6.4099f)
                curveTo(22.0f, 5.2039f, 22.0f, 4.6009f, 21.6854f, 4.1469f)
                curveTo(21.3708f, 3.693f, 20.8208f, 3.5023f, 19.7208f, 3.1209f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
