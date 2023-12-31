package com.chiksmedina.solar.outline.files

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.FilesGroup

val FilesGroup.FileCheck: ImageVector
    get() {
        if (_fileCheck != null) {
            return _fileCheck!!
        }
        _fileCheck = Builder(
            name = "FileCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.25f, 2.8342f)
                curveTo(11.7896f, 2.756f, 11.162f, 2.7501f, 10.0298f, 2.7501f)
                curveTo(8.1131f, 2.7501f, 6.7508f, 2.7516f, 5.7179f, 2.8899f)
                curveTo(4.706f, 3.0253f, 4.1245f, 3.2793f, 3.7019f, 3.702f)
                curveTo(3.2787f, 4.1252f, 3.025f, 4.7048f, 2.8898f, 5.7109f)
                curveTo(2.7516f, 6.7386f, 2.75f, 8.0932f, 2.75f, 10.0001f)
                verticalLineTo(14.0001f)
                curveTo(2.75f, 15.9069f, 2.7516f, 17.2615f, 2.8898f, 18.2892f)
                curveTo(3.025f, 19.2953f, 3.2787f, 19.8749f, 3.7019f, 20.2981f)
                curveTo(4.1251f, 20.7214f, 4.7048f, 20.975f, 5.7108f, 21.1103f)
                curveTo(6.7385f, 21.2485f, 8.0932f, 21.2501f, 10.0f, 21.2501f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 21.2501f, 17.2615f, 21.2485f, 18.2892f, 21.1103f)
                curveTo(19.2952f, 20.975f, 19.8749f, 20.7214f, 20.2981f, 20.2981f)
                curveTo(20.7213f, 19.8749f, 20.975f, 19.2953f, 21.1102f, 18.2892f)
                curveTo(21.2484f, 17.2615f, 21.25f, 15.9069f, 21.25f, 14.0001f)
                verticalLineTo(13.5629f)
                curveTo(21.25f, 12.0269f, 21.2392f, 11.2988f, 21.0762f, 10.7501f)
                horizontalLineTo(17.9463f)
                curveTo(16.8135f, 10.7501f, 15.8877f, 10.7501f, 15.1569f, 10.6518f)
                curveTo(14.3929f, 10.5491f, 13.7306f, 10.3268f, 13.2019f, 9.7982f)
                curveTo(12.6732f, 9.2695f, 12.4509f, 8.6071f, 12.3482f, 7.8432f)
                curveTo(12.25f, 7.1123f, 12.25f, 6.1866f, 12.25f, 5.0537f)
                verticalLineTo(2.8342f)
                close()
                moveTo(13.75f, 3.6095f)
                verticalLineTo(5.0001f)
                curveTo(13.75f, 6.1998f, 13.7516f, 7.0241f, 13.8348f, 7.6433f)
                curveTo(13.9152f, 8.2409f, 14.059f, 8.5339f, 14.2626f, 8.7375f)
                curveTo(14.4661f, 8.941f, 14.7591f, 9.0849f, 15.3568f, 9.1652f)
                curveTo(15.976f, 9.2485f, 16.8003f, 9.25f, 18.0f, 9.25f)
                horizontalLineTo(20.0195f)
                curveTo(19.723f, 8.9625f, 19.3432f, 8.618f, 18.85f, 8.1741f)
                lineTo(14.8912f, 4.6112f)
                curveTo(14.4058f, 4.1743f, 14.0446f, 3.8519f, 13.75f, 3.6095f)
                close()
                moveTo(10.1755f, 1.25f)
                curveTo(11.5601f, 1.2497f, 12.4546f, 1.2494f, 13.2779f, 1.5654f)
                curveTo(14.1012f, 1.8813f, 14.7632f, 2.4773f, 15.7873f, 3.3995f)
                curveTo(15.8226f, 3.4314f, 15.8584f, 3.4636f, 15.8947f, 3.4962f)
                lineTo(19.8534f, 7.0591f)
                curveTo(19.8956f, 7.0971f, 19.9372f, 7.1345f, 19.9783f, 7.1715f)
                curveTo(21.162f, 8.2361f, 21.9274f, 8.9246f, 22.3391f, 9.849f)
                curveTo(22.7508f, 10.7734f, 22.7505f, 11.8029f, 22.75f, 13.3949f)
                curveTo(22.75f, 13.4502f, 22.75f, 13.5062f, 22.75f, 13.5629f)
                verticalLineTo(14.0565f)
                curveTo(22.75f, 15.8942f, 22.75f, 17.3499f, 22.5969f, 18.4891f)
                curveTo(22.4392f, 19.6615f, 22.1071f, 20.6104f, 21.3588f, 21.3588f)
                curveTo(20.6104f, 22.1072f, 19.6614f, 22.4393f, 18.489f, 22.5969f)
                curveTo(17.3498f, 22.7501f, 15.8942f, 22.7501f, 14.0564f, 22.7501f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.7501f, 6.6502f, 22.7501f, 5.511f, 22.5969f)
                curveTo(4.3386f, 22.4393f, 3.3896f, 22.1072f, 2.6412f, 21.3588f)
                curveTo(1.8929f, 20.6104f, 1.5608f, 19.6615f, 1.4031f, 18.4891f)
                curveTo(1.25f, 17.3499f, 1.25f, 15.8942f, 1.25f, 14.0565f)
                verticalLineTo(9.9436f)
                curveTo(1.25f, 8.1059f, 1.25f, 6.6502f, 1.4031f, 5.511f)
                curveTo(1.5608f, 4.3386f, 1.8929f, 3.3897f, 2.6412f, 2.6413f)
                curveTo(3.3902f, 1.8923f, 4.3423f, 1.5606f, 5.5189f, 1.4031f)
                curveTo(6.6628f, 1.25f, 8.1257f, 1.25f, 9.9735f, 1.25f)
                lineTo(10.0298f, 1.25f)
                curveTo(10.0789f, 1.25f, 10.1275f, 1.25f, 10.1755f, 1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.4983f, 14.4395f)
                curveTo(10.8079f, 14.7147f, 10.8357f, 15.1887f, 10.5606f, 15.4983f)
                lineTo(7.8939f, 18.4983f)
                curveTo(7.7516f, 18.6584f, 7.5476f, 18.7501f, 7.3333f, 18.7501f)
                curveTo(7.1191f, 18.7501f, 6.9151f, 18.6584f, 6.7728f, 18.4983f)
                lineTo(5.4394f, 16.9983f)
                curveTo(5.1643f, 16.6887f, 5.1921f, 16.2147f, 5.5017f, 15.9395f)
                curveTo(5.8113f, 15.6643f, 6.2854f, 15.6922f, 6.5606f, 16.0018f)
                lineTo(7.3333f, 16.8712f)
                lineTo(9.4394f, 14.5018f)
                curveTo(9.7146f, 14.1922f, 10.1887f, 14.1643f, 10.4983f, 14.4395f)
                close()
            }
        }
            .build()
        return _fileCheck!!
    }

private var _fileCheck: ImageVector? = null
