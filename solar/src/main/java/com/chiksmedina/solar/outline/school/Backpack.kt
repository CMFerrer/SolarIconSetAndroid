package com.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.outline.SchoolGroup

public val SchoolGroup.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = Builder(name = "Backpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.25f)
                curveTo(9.5858f, 12.25f, 9.25f, 12.5858f, 9.25f, 13.0f)
                curveTo(9.25f, 13.4142f, 9.5858f, 13.75f, 10.0f, 13.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 13.75f, 14.75f, 13.4142f, 14.75f, 13.0f)
                curveTo(14.75f, 12.5858f, 14.4142f, 12.25f, 14.0f, 12.25f)
                horizontalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.3201f, 4.2753f)
                curveTo(7.6582f, 2.5509f, 9.1765f, 1.25f, 11.0f, 1.25f)
                horizontalLineTo(13.0f)
                curveTo(14.8236f, 1.25f, 16.3419f, 2.5509f, 16.6799f, 4.2753f)
                curveTo(19.625f, 5.0315f, 21.7073f, 7.6689f, 21.7494f, 10.7198f)
                curveTo(21.75f, 10.7665f, 21.75f, 10.8178f, 21.75f, 10.9044f)
                verticalLineTo(13.9829f)
                curveTo(21.7503f, 13.994f, 21.7503f, 14.0052f, 21.75f, 14.0163f)
                verticalLineTo(16.375f)
                curveTo(21.75f, 18.8445f, 20.0348f, 20.9827f, 17.6242f, 21.5184f)
                curveTo(13.9199f, 22.3415f, 10.0801f, 22.3415f, 6.3758f, 21.5184f)
                curveTo(3.9652f, 20.9827f, 2.25f, 18.8445f, 2.25f, 16.375f)
                verticalLineTo(14.0163f)
                curveTo(2.2498f, 14.0052f, 2.2497f, 13.994f, 2.25f, 13.9829f)
                verticalLineTo(10.9043f)
                curveTo(2.25f, 10.8177f, 2.25f, 10.7664f, 2.2506f, 10.7198f)
                curveTo(2.2927f, 7.6689f, 4.3751f, 5.0314f, 7.3201f, 4.2753f)
                close()
                moveTo(9.0145f, 3.9403f)
                curveTo(9.3934f, 3.232f, 10.1409f, 2.75f, 11.0f, 2.75f)
                horizontalLineTo(13.0f)
                curveTo(13.8592f, 2.75f, 14.6067f, 3.232f, 14.9856f, 3.9404f)
                curveTo(13.0068f, 3.6377f, 10.9933f, 3.6377f, 9.0145f, 3.9403f)
                close()
                moveTo(20.25f, 10.9111f)
                verticalLineTo(13.5066f)
                curveTo(14.9714f, 15.711f, 9.0286f, 15.711f, 3.75f, 13.5066f)
                verticalLineTo(10.9111f)
                curveTo(3.75f, 10.8157f, 3.75f, 10.7755f, 3.7505f, 10.7405f)
                curveTo(3.7837f, 8.3342f, 5.4487f, 6.2585f, 7.7906f, 5.7041f)
                curveTo(7.8246f, 5.6961f, 7.8639f, 5.6873f, 7.957f, 5.6666f)
                curveTo(8.0412f, 5.6479f, 8.0811f, 5.6391f, 8.1205f, 5.6305f)
                curveTo(10.6769f, 5.0743f, 13.3231f, 5.0743f, 15.8795f, 5.6305f)
                curveTo(15.9189f, 5.6391f, 15.9588f, 5.6479f, 16.0431f, 5.6666f)
                curveTo(16.1361f, 5.6873f, 16.1755f, 5.6961f, 16.2094f, 5.7041f)
                curveTo(18.5513f, 6.2585f, 20.2163f, 8.3342f, 20.2495f, 10.7405f)
                curveTo(20.25f, 10.7755f, 20.25f, 10.8157f, 20.25f, 10.9111f)
                close()
                moveTo(3.75f, 16.375f)
                verticalLineTo(15.123f)
                curveTo(7.9144f, 16.7307f, 12.433f, 17.0771f, 16.75f, 16.1622f)
                verticalLineTo(17.0f)
                curveTo(16.75f, 17.4142f, 17.0858f, 17.75f, 17.5f, 17.75f)
                curveTo(17.9142f, 17.75f, 18.25f, 17.4142f, 18.25f, 17.0f)
                verticalLineTo(15.7911f)
                curveTo(18.9241f, 15.5999f, 19.5915f, 15.3772f, 20.25f, 15.123f)
                verticalLineTo(16.375f)
                curveTo(20.25f, 18.1415f, 19.0231f, 19.6709f, 17.2988f, 20.0541f)
                curveTo(13.8088f, 20.8296f, 10.1912f, 20.8296f, 6.7012f, 20.0541f)
                curveTo(4.9769f, 19.6709f, 3.75f, 18.1415f, 3.75f, 16.375f)
                close()
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
