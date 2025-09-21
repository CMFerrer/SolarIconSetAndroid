package dev.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.NotebookSquare: ImageVector
    get() {
        if (_notebookSquare != null) {
            return _notebookSquare!!
        }
        _notebookSquare = Builder(
            name = "NotebookSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.52f, 5.2726f)
                curveTo(17.7923f, 5.2101f, 18.75f, 6.2569f, 18.75f, 7.4515f)
                verticalLineTo(12.9108f)
                curveTo(18.75f, 14.1716f, 17.7316f, 15.1365f, 16.5459f, 15.2249f)
                curveTo(16.0529f, 15.2617f, 15.5551f, 15.3216f, 15.178f, 15.4138f)
                curveTo(14.4402f, 15.594f, 13.4666f, 16.0647f, 12.857f, 16.3858f)
                curveTo(12.3214f, 16.6681f, 11.6786f, 16.6681f, 11.143f, 16.3858f)
                curveTo(10.5334f, 16.0647f, 9.5598f, 15.594f, 8.822f, 15.4138f)
                curveTo(8.4449f, 15.3216f, 7.9471f, 15.2617f, 7.4541f, 15.2249f)
                curveTo(6.2684f, 15.1365f, 5.25f, 14.1716f, 5.25f, 12.9108f)
                verticalLineTo(7.4965f)
                curveTo(5.25f, 6.2753f, 6.248f, 5.2182f, 7.5419f, 5.3129f)
                curveTo(8.0674f, 5.3514f, 8.6729f, 5.4188f, 9.178f, 5.5422f)
                curveTo(10.0998f, 5.7674f, 11.1985f, 6.3065f, 11.8132f, 6.6291f)
                curveTo(11.9157f, 6.6829f, 12.0434f, 6.6808f, 12.1463f, 6.6213f)
                curveTo(12.7018f, 6.2998f, 13.6675f, 5.7787f, 14.4997f, 5.548f)
                curveTo(15.1227f, 5.3753f, 15.8904f, 5.3035f, 16.52f, 5.2726f)
                close()
                moveTo(17.25f, 7.4515f)
                curveTo(17.25f, 7.0339f, 16.9314f, 6.7542f, 16.5935f, 6.7708f)
                curveTo(15.9907f, 6.8004f, 15.3582f, 6.8666f, 14.9003f, 6.9935f)
                curveTo(14.2696f, 7.1684f, 13.4487f, 7.6007f, 12.8975f, 7.9196f)
                curveTo(12.8493f, 7.9475f, 12.8001f, 7.9731f, 12.75f, 7.9963f)
                verticalLineTo(14.7586f)
                curveTo(13.3591f, 14.4625f, 14.1393f, 14.1234f, 14.822f, 13.9566f)
                curveTo(15.3199f, 13.835f, 15.9149f, 13.7678f, 16.4343f, 13.7291f)
                curveTo(16.9097f, 13.6936f, 17.25f, 13.3157f, 17.25f, 12.9108f)
                verticalLineTo(7.4515f)
                close()
                moveTo(11.116f, 7.9573f)
                curveTo(11.16f, 7.9804f, 11.2047f, 8.0015f, 11.25f, 8.0208f)
                verticalLineTo(14.7586f)
                curveTo(10.6409f, 14.4625f, 9.8607f, 14.1234f, 9.178f, 13.9566f)
                curveTo(8.6801f, 13.835f, 8.0851f, 13.7678f, 7.5657f, 13.7291f)
                curveTo(7.0903f, 13.6936f, 6.75f, 13.3157f, 6.75f, 12.9108f)
                verticalLineTo(7.4965f)
                curveTo(6.75f, 7.0697f, 7.0828f, 6.7833f, 7.4324f, 6.8089f)
                curveTo(7.9319f, 6.8455f, 8.439f, 6.9058f, 8.822f, 6.9994f)
                curveTo(9.548f, 7.1768f, 10.5035f, 7.6357f, 11.116f, 7.9573f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9436f, 0.25f)
                curveTo(8.1058f, 0.25f, 6.6502f, 0.25f, 5.511f, 0.4031f)
                curveTo(4.3386f, 0.5608f, 3.3896f, 0.8929f, 2.6412f, 1.6412f)
                curveTo(1.8929f, 2.3896f, 1.5608f, 3.3386f, 1.4031f, 4.511f)
                curveTo(1.25f, 5.6502f, 1.25f, 7.1058f, 1.25f, 8.9436f)
                verticalLineTo(13.0564f)
                curveTo(1.25f, 14.8942f, 1.25f, 16.3498f, 1.4031f, 17.489f)
                curveTo(1.5608f, 18.6614f, 1.8929f, 19.6104f, 2.6412f, 20.3588f)
                curveTo(3.3896f, 21.1071f, 4.3386f, 21.4392f, 5.511f, 21.5969f)
                curveTo(6.6502f, 21.75f, 8.1058f, 21.75f, 9.9435f, 21.75f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 21.75f, 17.3498f, 21.75f, 18.489f, 21.5969f)
                curveTo(19.6614f, 21.4392f, 20.6104f, 21.1071f, 21.3588f, 20.3588f)
                curveTo(22.1071f, 19.6104f, 22.4392f, 18.6614f, 22.5969f, 17.489f)
                curveTo(22.75f, 16.3498f, 22.75f, 14.8942f, 22.75f, 13.0565f)
                verticalLineTo(8.9436f)
                curveTo(22.75f, 7.1059f, 22.75f, 5.6502f, 22.5969f, 4.511f)
                curveTo(22.4392f, 3.3386f, 22.1071f, 2.3896f, 21.3588f, 1.6412f)
                curveTo(20.6104f, 0.8929f, 19.6614f, 0.5608f, 18.489f, 0.4031f)
                curveTo(17.3498f, 0.25f, 15.8942f, 0.25f, 14.0564f, 0.25f)
                horizontalLineTo(9.9436f)
                close()
                moveTo(3.7019f, 2.7019f)
                curveTo(4.1251f, 2.2787f, 4.7048f, 2.025f, 5.7108f, 1.8898f)
                curveTo(6.7385f, 1.7516f, 8.0932f, 1.75f, 10.0f, 1.75f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 1.75f, 17.2615f, 1.7516f, 18.2892f, 1.8898f)
                curveTo(19.2952f, 2.025f, 19.8749f, 2.2787f, 20.2981f, 2.7019f)
                curveTo(20.7213f, 3.1251f, 20.975f, 3.7048f, 21.1102f, 4.7108f)
                curveTo(21.2484f, 5.7385f, 21.25f, 7.0932f, 21.25f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(21.25f, 14.9068f, 21.2484f, 16.2615f, 21.1102f, 17.2892f)
                curveTo(20.975f, 18.2952f, 20.7213f, 18.8749f, 20.2981f, 19.2981f)
                curveTo(19.8749f, 19.7213f, 19.2952f, 19.975f, 18.2892f, 20.1102f)
                curveTo(17.2615f, 20.2484f, 15.9068f, 20.25f, 14.0f, 20.25f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 20.25f, 6.7385f, 20.2484f, 5.7108f, 20.1102f)
                curveTo(4.7048f, 19.975f, 4.1251f, 19.7213f, 3.7019f, 19.2981f)
                curveTo(3.2787f, 18.8749f, 3.025f, 18.2952f, 2.8898f, 17.2892f)
                curveTo(2.7516f, 16.2615f, 2.75f, 14.9068f, 2.75f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(2.75f, 7.0932f, 2.7516f, 5.7385f, 2.8898f, 4.7108f)
                curveTo(3.025f, 3.7048f, 3.2787f, 3.1251f, 3.7019f, 2.7019f)
                close()
            }
        }
            .build()
        return _notebookSquare!!
    }

private var _notebookSquare: ImageVector? = null
